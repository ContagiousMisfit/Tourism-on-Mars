package br.com.fiap.gs1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormResponseDTO {

    private LocalDate dataDecolagem;
    private int diasEstadia;
    private LocalDate dataRetorno;

    private String modelo;
    private int assentos;

    private String matriculaInterespacialComandante1;
    private String nomeComandante1;

    private String matriculaInterespacialComandante2;
    private String nomeComandante2;

}
