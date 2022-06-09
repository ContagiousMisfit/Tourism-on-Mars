package br.com.fiap.gs1.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Viagens {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataDecolagem;
	private int diasEstadia;
	private int diasViagemIdaEVolta = 880;

	private String modeloNave;
	private int assentos;

	private String comandante1;
	private String comandante2;
	private String matriculaInterespacial1;
	private String matriculaInterespacial2;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataRetorno;

	public Viagens(Long id, LocalDate dataDecolagem, int diasEstadia, int diasViagemIdaEVolta, LocalDate dataRetorno,
			String modeloNave, int assentos, String comandante1, String comandante2, String matriculaInterespacial1,
			String matriculaInterespacial2) {
		this.id = id;
		this.dataDecolagem = dataDecolagem;
		this.diasEstadia = diasEstadia;
		this.diasViagemIdaEVolta = diasViagemIdaEVolta;
		this.dataRetorno = dataDecolagem.plusDays(getDiasViagemIdaEVolta()).plusDays(diasEstadia);
		this.modeloNave = modeloNave;
		this.assentos = assentos;
		this.comandante1 = comandante1;
		this.comandante2 = comandante2;
		this.matriculaInterespacial1 = matriculaInterespacial1;
		this.matriculaInterespacial2 = matriculaInterespacial2;
	}

}