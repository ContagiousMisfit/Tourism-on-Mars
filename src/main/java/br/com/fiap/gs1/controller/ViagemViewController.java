package br.com.fiap.gs1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import br.com.fiap.gs1.model.Viagens;
import br.com.fiap.gs1.repository.ViagensRepository;


@Controller
@RequestMapping("viagens")
public class ViagemViewController {

	private ViagensRepository viagensRepository;

	public ViagemViewController(ViagensRepository viagensRepository) {
		this.viagensRepository = viagensRepository;
	}

	@GetMapping
	public String list(Model model) {
		model.addAttribute("viagem", viagensRepository.findAll());
		return "viagens";
	}

	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("viagem", new Viagens());
		return "form-cadastro";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Long id, Model model) {
		model.addAttribute("viagem", viagensRepository.findById(id).get());
		return "form-cadastro";
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Long id) {
		viagensRepository.deleteById(id);
		RedirectView redirectView = new RedirectView("/viagens");
		return redirectView;
	}
	
	@PostMapping("/save")
	public RedirectView saveViagem(@ModelAttribute("viagem") Viagens viagem, RedirectAttributes attrs) {

		Viagens viagemSalva = viagensRepository.save(viagem);
		
		attrs.addFlashAttribute("viagemAdicionadaComSucesso", true);
		attrs.addFlashAttribute("viagemSalva", viagemSalva);

		RedirectView redirectView = new RedirectView("/viagens");

		return redirectView;		
		
	}
	
	/*Viagens viagem1 = new Viagens(123, LocalDate.now(), 30, 880, LocalDate.now(), "XPTO333", 
			300, "Antônio Carlos", "Rômulo Domiciano", "123C", "456B");*/

}



