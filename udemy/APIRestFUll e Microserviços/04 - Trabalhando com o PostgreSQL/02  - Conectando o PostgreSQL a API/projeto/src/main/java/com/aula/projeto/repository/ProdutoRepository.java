package com.aula.projeto.repository;

import com.aula.projeto.model.ProdutoModel;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ProdutoRepository {

    public ProdutoModel ObterTodosOsProdutos(){
        return produtos;
    }

    public  ProdutoModel obterProdutoPorId(Integer id){

    }


    public ProdutoModel adicionarProduto(ProdutoModel produto){

    }

    public void deletarProduto(Integer id){

    }

    public ProdutoModel atualizarProduto(ProdutoModel produto){
        Optional<ProdutoModel> produtoEncontrado = obterProdutoPorId(produto.getId());

        if (produtoEncontrado.isEmpty()){
            throw new ResourceNotFoundException("Produto não encontrado");
        }
        deletarProduto(produto.getId());
        return produto;
    }


}

