package br.com.fiap.gs1.model;

import java.time.LocalDate;

import javax.persistence.*;

import br.com.fiap.gs1.dtos.FormRequestDTO;
import br.com.fiap.gs1.dtos.FormResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Viagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private LocalDate dataDecolagem;
	private int diasEstadia;
	private LocalDate dataRetorno;
	private int diasViagemIdaEVolta = 880;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Nave nave;

	public Viagem(FormRequestDTO formRequestDTO, Nave nave) {
		this.dataDecolagem = formRequestDTO.getDataDecolagem();
		this.diasEstadia = formRequestDTO.getDiasEstadia();
		this.nave = nave;
		this.dataRetorno = dataDecolagem.plusDays(getDiasViagemIdaEVolta()).plusDays(diasEstadia);
	}

	public FormResponseDTO convertToResponseDTO() {
		return new FormResponseDTO(dataDecolagem, diasEstadia, dataRetorno, nave.getModelo(), nave.getAssentos(), nave.getComandante1().getNome(), nave.getComandante1().getMatriculaInterespacial(), nave.getComandante2().getNome(), nave.getComandante2().getMatriculaInterespacial());
	}

}
