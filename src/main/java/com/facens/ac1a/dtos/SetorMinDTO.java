package com.facens.ac1a.dtos;

import com.facens.ac1a.models.Setor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SetorMinDTO {
    private Integer id;
    private String nome;

    public SetorMinDTO(Setor entity){
        this.nome = entity.getNome();
        this.id = entity.getId();
    }
}
