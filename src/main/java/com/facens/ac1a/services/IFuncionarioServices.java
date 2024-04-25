package com.facens.ac1a.services;

import com.facens.ac1a.dtos.DadosProjetoDTO;
import com.facens.ac1a.dtos.FuncionarioCadDTO;
import com.facens.ac1a.dtos.FuncionarioDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IFuncionarioServices {

    FuncionarioDTO findFuncByid(Integer id);

    void adicionar(FuncionarioCadDTO funcionario);

    List<DadosProjetoDTO> returnDadosProjeto(Integer funcId);

    FuncionarioDTO findById(Integer id);
}
