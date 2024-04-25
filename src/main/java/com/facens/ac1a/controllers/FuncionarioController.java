package com.facens.ac1a.controllers;

import com.facens.ac1a.dtos.DadosProjetoDTO;
import com.facens.ac1a.dtos.FuncionarioCadDTO;
import com.facens.ac1a.dtos.FuncionarioDTO;
import com.facens.ac1a.services.IFuncionarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/func")
public class FuncionarioController {

    @Autowired
    private IFuncionarioServices funcionarioServices;

    @PostMapping("/add")
    public void adicionar(@RequestBody FuncionarioCadDTO funcionario){
        funcionarioServices.adicionar(funcionario);
    }

    @GetMapping("/projects/{funcId}")
    public List<DadosProjetoDTO> dadosProjeto(@PathVariable Integer funcId){
        return funcionarioServices.returnDadosProjeto(funcId);
    }

    @GetMapping("/find/{id}")
    public FuncionarioDTO findFunc(@PathVariable  Integer id){
        return funcionarioServices.findById(id);
    }
}
