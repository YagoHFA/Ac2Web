package com.facens.ac1a.dtos;

import com.facens.ac1a.models.Projeto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class DadosProjetoDTO {

    private Integer id;
    private String descricao;
    private LocalDate dataIni;
    private LocalDate dataFim;

    public DadosProjetoDTO(Projeto entity){
        this.dataFim = entity.getDataFim();
        this.dataIni = entity.getDataInicio();
        this.descricao = entity.getDescricao();
        this.id = entity.getId();
    }
}
