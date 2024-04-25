package com.facens.ac1a.services.impl;

import com.facens.ac1a.dtos.ProjetoDTO;
import com.facens.ac1a.dtos.ProjetoFullDTO;
import com.facens.ac1a.models.Funcionario;
import com.facens.ac1a.models.Projeto;
import com.facens.ac1a.repositories.FuncionarioRepository;
import com.facens.ac1a.repositories.ProjetoRepository;
import com.facens.ac1a.services.IProjetoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProjetoService implements IProjetoServices {

    @Autowired
    private ProjetoRepository projetoRepository;

    @Autowired
    private FuncionarioRepository  funcionarioRepository;

    @Override
    public List<Projeto> findprojectByDate(LocalDate ini, LocalDate fim) {
        return projetoRepository.findByDataInicioBetween(ini, fim);
    }

    @Override
    public ProjetoFullDTO findProjectbyId(Integer id) {
        return new ProjetoFullDTO(projetoRepository.findProjetoById(id));
    }

    @Override
    public void adicionar(ProjetoDTO projeto) {

         projetoRepository.save(
                 Projeto.builder()
                         .id(projeto.getId())
                         .descricao(projeto.getDescricao())
                         .dataInicio(projeto.getDataInicio())
                         .dataFim(projeto.getDataFim())
                         .build()
         );
    }

    @Override
    public void vincularFuncionario(Integer funcId, Integer projectId) {
        Funcionario funcToupdate = funcionarioRepository.findFuncionarioById(funcId);
       funcToupdate.getProjetoList().add(projetoRepository.findProjetoById(projectId));
       funcionarioRepository.save(funcToupdate);
    }
}
