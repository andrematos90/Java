package com.teste.projeto.controller;


import com.teste.projeto.model.ProdutoModel;
import com.teste.projeto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<ProdutoModel> obterTodosOsProdutos(){
        return produtoService.obterTodosOsProdutos();

    }
    @PostMapping
    public ProdutoModel adicionarUmProduto(@RequestBody ProdutoModel produto){
        return produtoService.adicionarUmProduto(produto);
    }

}