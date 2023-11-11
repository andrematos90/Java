package com.aula.projeto.service;

import com.aula.projeto.model.ProdutoModel;
import com.aula.projeto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {
    private ProdutoRepository produtoRepository;
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public ProdutoModel ObterTodosOsProdutos(){
        return produtoRepository.ObterTodosOsProdutos();
    }

    public Optional<ProdutoModel> obterProdutoPorId(Integer id){
        return  produtoRepository.obterProdutoPorId(id);
    }

    public ProdutoModel adicionarProduto(ProdutoModel produto){
        return produtoRepository.adicionarProduto(produto);
    }

    public void deletarProduto(Integer id){
        produtoRepository.deletarProduto(id);
    }

    public ProdutoModel atualizarProduto(ProdutoModel produto){
        return produtoRepository.atualizarProduto(produto);

    }

}
