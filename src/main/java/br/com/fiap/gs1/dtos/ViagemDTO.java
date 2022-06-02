package br.com.fiap.gs1.dtos;

import java.time.LocalDate;

import br.com.fiap.gs1.model.Viagem;

public class ViagemDTO {

	private LocalDate dataDecolagem;
	private int diasEstadia;
	
	public ViagemDTO(LocalDate dataDecolagem, int diasEstadia) {
		super();
		this.dataDecolagem = dataDecolagem;
		this.diasEstadia = diasEstadia;
	}
	
	public ViagemDTO() {}
	
	public ViagemDTO(Viagem viagem) {
		dataDecolagem = viagem.getDataDecolagem();
		diasEstadia = viagem.getDiasEstadia();
	}
	
	
}
