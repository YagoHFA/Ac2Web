package com.facens.ac1a.dtos;


import com.facens.ac1a.models.Projeto;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjetoFullDTO {
    private Integer id;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<FuncToProjectDTO> funcionario;

    public ProjetoFullDTO(Projeto entity) {
        this.id = entity.getId();
        this.descricao = entity.getDescricao();
        this.dataInicio = entity.getDataInicio();
        this.dataFim = entity.getDataFim();
        this.funcionario = entity.getFuncionarioList().stream().map(FuncToProjectDTO::new).toList();
    }
}
