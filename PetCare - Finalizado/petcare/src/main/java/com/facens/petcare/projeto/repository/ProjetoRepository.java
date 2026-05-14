package com.facens.petcare.projeto.repository;

import com.facens.petcare.projeto.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

    @Query("SELECT p FROM Projeto p WHERE p.dataInicio BETWEEN :inicio AND :fim")
    List<Projeto> buscarPorPeriodo(LocalDate inicio, LocalDate fim);

    @Query("SELECT p FROM Projeto p JOIN p.funcionarios f WHERE f.id = :funcionarioId")
    List<Projeto> buscarPorFuncionario(Long funcionarioId);
}