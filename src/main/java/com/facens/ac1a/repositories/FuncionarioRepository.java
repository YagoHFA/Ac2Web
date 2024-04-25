package com.facens.ac1a.repositories;

import com.facens.ac1a.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    @Query(value = "select ff from Funcionario ff left join fetch ff.projetoList where ff.id = :id")
    Funcionario findFuncionarioById(@Param("id") Integer id);

}
