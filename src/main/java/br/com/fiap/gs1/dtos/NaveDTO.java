package br.com.fiap.gs1.dtos;

import br.com.fiap.gs1.model.Nave;

public class NaveDTO {
	
	private String modelo;
	private int assentos;
	
	
	public NaveDTO() {};
	
	public NaveDTO(String modelo, int assentos) {
		this.modelo = modelo;
		this.assentos = assentos;
	}
	
	public NaveDTO(Nave nave) {
		modelo = nave.getModelo();
		assentos = nave.getAssentos();
	}

}
