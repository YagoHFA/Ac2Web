package com.facens.ac1a.dtos;

import com.facens.ac1a.models.Setor;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class SetorDTO {

    private Integer id;
    private String nome;
    private List<FuncionarioDTO> funcionarioList;

    public SetorDTO(Setor entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.funcionarioList = entity.getFuncionarioList().stream().map(FuncionarioDTO::new).toList();
    }
}
