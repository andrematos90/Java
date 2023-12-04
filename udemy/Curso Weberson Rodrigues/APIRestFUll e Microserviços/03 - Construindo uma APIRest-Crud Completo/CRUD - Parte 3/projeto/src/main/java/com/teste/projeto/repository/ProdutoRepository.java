package com.teste.projeto.repository;

import com.teste.projeto.model.ProdutoModel;
import com.teste.projeto.model.exception.ResourceNotFounException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoRepository {
    private List<ProdutoModel> produtos = new ArrayList<ProdutoModel>();
    private Integer ultimoId = 0;
    public List<ProdutoModel> obterTodosOsProdutos(){
        return produtos;
    }

    public Optional<ProdutoModel> obterProdutoPorId(Integer id){
        return produtos
                .stream()
                .filter(produto -> produto.getId() ==id)
                .findFirst();
    }

    public ProdutoModel adicionarUmProduto(ProdutoModel produto){
        ultimoId++;
        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;

    }

    public void deletarProduto(Integer id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    public  ProdutoModel atualizarProduto(ProdutoModel produto){
        Optional<ProdutoModel> produtoEncontrado = obterProdutoPorId(produto.getId());

        if(produtoEncontrado.isEmpty()){
            throw new ResourceNotFounException("Produto não encotrado!");
        }
        deletarProduto(produto.getId());

        produtos.add(produto);
        return produto;
    }
}
