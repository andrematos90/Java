package com.teste.projeto.controller;


import com.teste.projeto.model.ProdutoModel;
import com.teste.projeto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<ProdutoModel> obterTodosOsProdutos() {
        return produtoService.obterTodosOsProdutos();

    }

    @PostMapping
    public ProdutoModel adicionarUmProduto(@RequestBody ProdutoModel produto) {
        return produtoService.adicionarUmProduto(produto);
    }

    @GetMapping("/{id}")
    public Optional<ProdutoModel> obterProdutoPorId(@PathVariable Integer id) {
        return produtoService.obterProdutoPorId(id);
    }

    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable Integer id) {
        produtoService.deletarProduto(id);
        return String.format("Produto com o id %d deletado com sucesso!", id);
    }

    @PutMapping("/{id}")
    public ProdutoModel atualizarProduto(@RequestBody ProdutoModel produto, @PathVariable Integer id) {
        return produtoService.atualizarProduto(id, produto);
    }
}

