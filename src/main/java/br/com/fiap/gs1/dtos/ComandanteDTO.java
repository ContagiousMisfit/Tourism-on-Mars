package br.com.fiap.gs1.dtos;

import br.com.fiap.gs1.model.Comandante;

public class ComandanteDTO {
	
	private String matriculaInterespacial;
	private String nome;
	
	public ComandanteDTO(String matriculaInterespacial, String nome) {
		this.matriculaInterespacial = matriculaInterespacial;
		this.nome = nome;
	}
	
	public ComandanteDTO() {}
	
	public ComandanteDTO(Comandante comandante) {
		matriculaInterespacial = comandante.getMatriculaInterespacial();
		nome = comandante.getNome();
	}
	
	

}
