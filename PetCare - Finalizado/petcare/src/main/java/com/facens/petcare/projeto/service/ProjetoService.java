package com.facens.petcare.projeto.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.facens.petcare.projeto.entity.*;
import com.facens.petcare.projeto.repository.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjetoService {

    private final ProjetoRepository projetoRepository;
    private final FuncionarioRepository funcionarioRepository;

    public Projeto salvar(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public Projeto buscarPorId(Long id) {
        return projetoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projeto não encontrado"));
    }

   public Projeto vincularFuncionario(Long projetoId, Long funcionarioId){

    Projeto projeto = buscarPorId(projetoId);

    Funcionario funcionario = funcionarioRepository.findById(funcionarioId)
            .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));

    projeto.getFuncionarios().add(funcionario);

    return projetoRepository.save(projeto);
}

    public List<Projeto> buscarPorFuncionario(Long id) {
        return projetoRepository.buscarPorFuncionario(id);
    }
}