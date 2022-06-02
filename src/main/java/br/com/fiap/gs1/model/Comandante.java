package br.com.fiap.gs1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Comandante {
	
	@Id
	private String matriculaInterespacial;
	private String nome;
	
	@ManyToOne
	private Nave nave;
	

}
