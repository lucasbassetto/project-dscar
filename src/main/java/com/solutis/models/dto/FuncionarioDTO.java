package com.solutis.models.dto;

import com.solutis.models.entities.Funcionario;
import org.springframework.beans.BeanUtils;

public class FuncionarioDTO extends PessoaDTO {

    private String matricula;

    public FuncionarioDTO() {
    }

    public FuncionarioDTO(Funcionario entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
