package com.solutis.models.dto;

import com.solutis.models.entities.Motorista;

public class MotoristaDTO extends PessoaDTO {

    private String numeroCNH;

    public MotoristaDTO() {

    }

    public MotoristaDTO(Motorista entity) {
        numeroCNH = entity.getNumeroCNH();
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }
}
