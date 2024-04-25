package com.facens.ac1a.controllers;

import com.facens.ac1a.dtos.SetorDTO;
import com.facens.ac1a.dtos.SetorMinDTO;
import com.facens.ac1a.services.ISetorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/setor")
public class SetorController {

    @Autowired
    private ISetorServices setorServices;

    @PostMapping("/add")
    private void adicionar(@RequestBody SetorMinDTO setor){
        setorServices.adicionar(setor)  ;
    }

    @GetMapping("/find/{id}")
    private SetorDTO findByID(@PathVariable Integer id){
        return setorServices.findById(id);
    }

}
