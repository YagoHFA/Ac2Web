package com.facens.ac1a.dtos;

import com.facens.ac1a.models.Projeto;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class ProjetoDTO {

    private Integer id;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public ProjetoDTO (Projeto entity){
       this.id = entity.getId();
       this.descricao = entity.getDescricao();
       this.dataInicio = entity.getDataInicio();
       this.dataFim = entity.getDataFim();
    }
}
