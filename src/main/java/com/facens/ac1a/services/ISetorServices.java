package com.facens.ac1a.services;

import com.facens.ac1a.dtos.SetorDTO;
import com.facens.ac1a.dtos.SetorMinDTO;
import com.facens.ac1a.models.Setor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ISetorServices {

    List<Setor> findAllandFunc();

    void adicionar(SetorMinDTO setor);

    SetorDTO findById(Integer id);
}
