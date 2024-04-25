package com.facens.ac1a.repositories;

import com.facens.ac1a.models.Setor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Integer>{


    @Override
    Optional<Setor> findById(Integer integer);
}
