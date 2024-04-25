package com.facens.ac1a.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Builder
@AllArgsConstructor
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    private Setor setor;

    @ManyToMany
    @JoinTable(name = "func_in_project", joinColumns = {
            @JoinColumn(name = "func_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "project_id")
    })
    private List<Projeto> projetoList;

    public Funcionario() {
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
