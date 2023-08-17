package com.solutis.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.solutis.models.entities.enums.Sexo;
import lombok.Data;

import java.time.Instant;

@Data
public class PessoaDTO {

    private Long id;
    private String nome;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant date;
    private String cpf;
    private Sexo sexo;
}
