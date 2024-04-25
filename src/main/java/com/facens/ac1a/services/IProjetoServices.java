package com.facens.ac1a.services;

import com.facens.ac1a.dtos.ProjetoDTO;
import com.facens.ac1a.dtos.ProjetoFullDTO;
import com.facens.ac1a.models.Projeto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface IProjetoServices {

    List<Projeto> findprojectByDate(LocalDate ini, LocalDate fim);

    ProjetoFullDTO findProjectbyId(Integer id);

    void adicionar(ProjetoDTO projeto);

    void vincularFuncionario(Integer funcId, Integer projectId);
}
