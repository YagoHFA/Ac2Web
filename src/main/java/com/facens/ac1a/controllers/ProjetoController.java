package com.facens.ac1a.controllers;

import com.facens.ac1a.dtos.ProjetoDTO;
import com.facens.ac1a.dtos.ProjetoFullDTO;
import com.facens.ac1a.services.IProjetoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjetoController {

    @Autowired
    private IProjetoServices projetoServices;

    @PostMapping("/add")
    public void adicionar(@RequestBody ProjetoDTO projeto){
        this.projetoServices.adicionar(projeto);
    }

    @GetMapping("/find/{id}")
    public ProjetoFullDTO findById(@PathVariable Integer id){
        return projetoServices.findProjectbyId(id);
    }

    @PutMapping("update/{funcID}/{projectID}")
    public void vinculaProjeto(@PathVariable Integer funcID,@PathVariable Integer projectID){
        projetoServices.vincularFuncionario(funcID, projectID);
    }
}
