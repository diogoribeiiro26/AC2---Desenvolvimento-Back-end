package com.facens.petcare.projeto.controller;

import com.facens.petcare.projeto.entity.Projeto;
import com.facens.petcare.projeto.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public Projeto salvar(@RequestBody Projeto projeto){
        return projetoService.salvar(projeto);
    }

    @GetMapping("/{id}")
    public Projeto buscarPorId(@PathVariable Long id){
        return projetoService.buscarPorId(id);
    }

    @PutMapping("/{projetoId}/funcionario/{funcionarioId}")
    public Projeto vincularFuncionario(
            @PathVariable Long projetoId,
            @PathVariable Long funcionarioId){

        return projetoService.vincularFuncionario(projetoId, funcionarioId);
    }

    @GetMapping("/funcionario/{id}")
    public List<Projeto> buscarPorFuncionario(@PathVariable Long id){
        return projetoService.buscarPorFuncionario(id);
    }
}