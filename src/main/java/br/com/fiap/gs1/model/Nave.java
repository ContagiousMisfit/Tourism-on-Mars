package br.com.fiap.gs1.model;

import java.util.List;

import javax.persistence.*;

import br.com.fiap.gs1.dtos.FormRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Nave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String modelo;
	private int assentos;

	@OneToOne(cascade = CascadeType.ALL)
	private Comandante comandante1;
	@OneToOne(cascade = CascadeType.ALL)
	private Comandante comandante2;

	public Nave(FormRequestDTO formRequestDTO, Comandante comandante1, Comandante comandante2) {
		this.modelo = formRequestDTO.getModelo();
		this.assentos = formRequestDTO.getAssentos();
		this.comandante1 = comandante1;
		this.comandante2 = comandante2;
	}

}
