package br.com.fiap.gs1.controller;

import br.com.fiap.gs1.dtos.FormRequestDTO;
import br.com.fiap.gs1.dtos.FormResponseDTO;
import br.com.fiap.gs1.model.Comandante;
import br.com.fiap.gs1.model.Nave;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import br.com.fiap.gs1.model.Viagem;
import br.com.fiap.gs1.repository.ViagemRepository;

import javax.transaction.Transactional;


@Controller
@RequestMapping("viagens")
public class ViagemViewController {

	private ViagemRepository viagemRepository;

	public ViagemViewController(ViagemRepository viagemRepository) {
		this.viagemRepository = viagemRepository;
	}

	@GetMapping
	public String list(Model model) {
		return null;
	}

	@GetMapping("/form")
	public String showForm(Model model) {
		return "form-cadastro";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Long id, Model model) {
		return null;
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Long id) {
		viagemRepository.deleteById(id);
		RedirectView redirectView = new RedirectView("/viagens");
		return redirectView;
	}

	@PostMapping("/save")
	@Transactional
	public RedirectView save(@ModelAttribute("viagem") FormRequestDTO formRequest, RedirectAttributes attrs) {

		Comandante comandante1 = formRequest.returnComandante1();
		Comandante comandante2 = formRequest.returnComandante2();

		Nave nave = new Nave(formRequest, comandante1, comandante2);
		Viagem viagem = new Viagem(formRequest, nave);

		Viagem viagemSalva = viagemRepository.saveAndFlush(viagem);
		FormResponseDTO formResponseDTO = viagemSalva.convertToResponseDTO();

		attrs.addFlashAttribute("viagemAdicionadaComSucesso", true);
		attrs.addFlashAttribute("viagemSalva", formResponseDTO);

		RedirectView redirectView = new RedirectView("/viagens");
		return redirectView;
		
	}

}
