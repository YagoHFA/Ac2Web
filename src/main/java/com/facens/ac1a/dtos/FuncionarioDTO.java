package com.facens.ac1a.dtos;

import com.facens.ac1a.models.Funcionario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class FuncionarioDTO {

    private Integer id;
    private String nome;
    private SetorMinDTO setorDTO;
    private List<ProjetoDTO> projetoList;

    public FuncionarioDTO(Funcionario entity){
       this.id = entity.getId();
       this.nome = entity.getNome();
       this.projetoList = entity.getProjetoList().stream().map(ProjetoDTO::new).toList();
       this.setorDTO = new SetorMinDTO(entity.getSetor());
    }
}
