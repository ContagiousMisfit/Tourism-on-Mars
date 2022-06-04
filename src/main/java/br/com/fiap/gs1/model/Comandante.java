package br.com.fiap.gs1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.fiap.gs1.dtos.FormRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Comandante {
	
	@Id
	private String matriculaInterespacial;
	private String nome;

}
