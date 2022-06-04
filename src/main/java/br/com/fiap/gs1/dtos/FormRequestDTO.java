package br.com.fiap.gs1.dtos;

import br.com.fiap.gs1.model.Comandante;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class FormRequestDTO {

    private String modelo;
    private int assentos;

    private LocalDate dataDecolagem;
    private int diasEstadia;

    private String matriculaInterespacialComandante1;
    private String nomeComandante1;

    private String matriculaInterespacialComandante2;
    private String nomeComandante2;

    public Comandante returnComandante1() { return new Comandante(matriculaInterespacialComandante1, nomeComandante1); }

    public Comandante returnComandante2() {
        return new Comandante(matriculaInterespacialComandante2, nomeComandante2);
    }

}
