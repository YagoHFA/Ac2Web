package com.facens.ac1a.repositories;

import com.facens.ac1a.models.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {

    @Query(value = "select pp from Projeto  pp left join fetch pp.funcionarioList where pp.id = :id")
    Projeto findProjetoById(@Param("id") Integer id);

    List<Projeto> findByDataInicioBetween(LocalDate dataInicioStart, LocalDate dataInicioEnd);

}
