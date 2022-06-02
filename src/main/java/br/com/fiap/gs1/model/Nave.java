package br.com.fiap.gs1.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Nave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String modelo;
	private int assentos;
	
	@OneToMany
	private List<Comandante> listaDeComandantes;
	
	@OneToMany
	private List<Viagem> viagem;
	

}
