package com.pessoa.controledepessoa.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoa.controledepessoa.model.PessoaModel;

@RestController
@RequestMapping("api/pessoas")
public class PessoaController {

    @GetMapping
    public ArrayList<PessoaModel> obterTodos(){
        PessoaModel pessoa1 = new PessoaModel();
        pessoa1.setNome("André");
        pessoa1.setEmail("andrermatos90@gmail.com");
        pessoa1.setNome("47999698126");

        PessoaModel pessoa2 = new PessoaModel();

        pessoa2.setNome("Alice");
        pessoa2.setEmail("alicedeassispereira@gmail.com");
        pessoa2.setTelefone("47988283589");

        ArrayList<PessoaModel> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        return pessoas;
    }
   
}

