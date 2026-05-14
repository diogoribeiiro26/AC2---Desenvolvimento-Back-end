package com.facens.petcare.projeto.controller;

import com.facens.petcare.projeto.entity.Setor;
import com.facens.petcare.projeto.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setores")
public class SetorController {

    @Autowired
    private SetorService setorService;

    @PostMapping
    public Setor salvar(@RequestBody Setor setor){
        return setorService.salvar(setor);
    }

    @GetMapping
    public List<Setor> listar(){
        return setorService.listar();
    }
}