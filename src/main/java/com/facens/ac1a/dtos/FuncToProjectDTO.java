package com.facens.ac1a.dtos;

import com.facens.ac1a.models.Funcionario;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FuncToProjectDTO {
    private String nome;
    private Integer id;
    private SetorMinDTO setor;

    public FuncToProjectDTO(Funcionario entity) {
        this.nome = entity.getNome();
        this.id = entity.getId();
        this.setor = new SetorMinDTO(entity.getSetor());
    }
}
