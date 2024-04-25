package com.facens.ac1a.services.impl;

import com.facens.ac1a.dtos.SetorDTO;
import com.facens.ac1a.dtos.SetorMinDTO;
import com.facens.ac1a.models.Setor;
import com.facens.ac1a.repositories.SetorRepository;
import com.facens.ac1a.services.ISetorServices;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorServices implements ISetorServices {

    @Autowired
    private SetorRepository setorRepository;

    @Override
    public List<Setor> findAllandFunc() {
        return setorRepository.findAll();
    }

    @Override
    public void adicionar(SetorMinDTO setor) {
        Setor setorToSave = new Setor();
        setorToSave.setNome(setor.getNome());
        setorRepository.save(setorToSave);
    }

    @Override
    public SetorDTO findById(Integer id) {
        return setorRepository.findById(id)
                .map(SetorDTO::new)
                .orElseThrow();
    }
}
