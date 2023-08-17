package com.solutis.models.entities;

import com.solutis.models.entities.enums.Sexo;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

import java.time.Instant;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends Pessoa {

    @NotBlank
    private String matricula;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, Instant date, String cpf, Sexo sexo, String matricula) {
        super(id, nome, date, cpf, sexo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
