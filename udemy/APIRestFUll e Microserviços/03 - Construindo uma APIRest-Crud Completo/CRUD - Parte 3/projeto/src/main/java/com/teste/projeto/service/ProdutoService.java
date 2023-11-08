package com.teste.projeto.service;

import com.teste.projeto.model.ProdutoModel;
import com.teste.projeto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> obterTodosOsProdutos(){
        return produtoRepository.obterTodosOsProdutos();
    }

    public Optional<ProdutoModel> obterProdutoPorId(Integer id){
        return  produtoRepository.obterProdutoPorId(id);
    }

    public ProdutoModel adicionarUmProduto(ProdutoModel produto){
        return produtoRepository.adicionarUmProduto(produto);
    }

    public void deletarProduto(Integer id){
        produtoRepository.deletarProduto(id);
    }

    public ProdutoModel atualizarProduto(Integer id, ProdutoModel produto){
        produto.setId(id);
        return produtoRepository.atualizarProduto(produto);
    }
}
