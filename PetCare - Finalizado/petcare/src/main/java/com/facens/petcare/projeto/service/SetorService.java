package com.facens.petcare.projeto.service;

import com.facens.petcare.projeto.entity.Setor;
import com.facens.petcare.projeto.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorService {

    @Autowired
    private SetorRepository setorRepository;

    public Setor salvar(Setor setor){
        return setorRepository.save(setor);
    }

    public List<Setor> listar(){
        return setorRepository.findAll();
    }
}