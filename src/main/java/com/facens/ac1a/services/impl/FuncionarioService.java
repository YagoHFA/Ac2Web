package com.facens.ac1a.services.impl;

import com.facens.ac1a.dtos.DadosProjetoDTO;
import com.facens.ac1a.dtos.FuncionarioCadDTO;
import com.facens.ac1a.dtos.FuncionarioDTO;
import com.facens.ac1a.models.Funcionario;
import com.facens.ac1a.repositories.FuncionarioRepository;
import com.facens.ac1a.repositories.SetorRepository;
import com.facens.ac1a.services.IFuncionarioServices;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService implements IFuncionarioServices {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private SetorRepository setorRepository;

    @Transactional
    @Override
    public FuncionarioDTO findFuncByid(Integer id) {
        return new FuncionarioDTO(funcionarioRepository.findFuncionarioById(id));
    }

    @Override
    public void adicionar(FuncionarioCadDTO funcionario) {
        funcionarioRepository.save(Funcionario.builder()
                .id(funcionario.getId())
                .nome(funcionario.getNome())
                .setor(setorRepository.findById(funcionario.getId()).orElseThrow())
                .build()
        );
    }

    @Override
    public List<DadosProjetoDTO> returnDadosProjeto(Integer funcId) {
        Funcionario dto = funcionarioRepository.findFuncionarioById(funcId);
        return dto.getProjetoList().stream().map(DadosProjetoDTO::new).toList();
    }

    @Override
    public FuncionarioDTO findById(Integer id) {
        return new FuncionarioDTO(funcionarioRepository.findById(id).orElseThrow());
    }

}
