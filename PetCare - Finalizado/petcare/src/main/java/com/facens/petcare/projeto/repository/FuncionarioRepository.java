package com.facens.petcare.projeto.repository;

import com.facens.petcare.projeto.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}