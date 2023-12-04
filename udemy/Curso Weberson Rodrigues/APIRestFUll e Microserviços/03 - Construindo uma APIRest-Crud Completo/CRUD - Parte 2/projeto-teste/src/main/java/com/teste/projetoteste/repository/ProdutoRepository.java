package com.teste.projetoteste.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.teste.projetoteste.model.Produto;

@Repository
public class ProdutoRepository {
    //lista para simular banco de dados
    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

   // método para retornar lista de protutos
    public List<Produto> obterTodos(){
        return produtos;
    }

    /*método retorna o produto por id*/
    public Optional<Produto> obterPorID(Integer id){
        return produtos
        .stream()
        .filter(produto -> produto.getId() == id)
        .findFirst();
    }

    //adiciona produto a lista
    public Produto adicionar(Produto produto){
        ultimoId++;
        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;
    }   

    //deleta produtor da lista
    public void deletar(Integer id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    /*autualiza produto na lista */
    public Produto atualizar(Produto produto){
        
        //encontra o produto na lista
        Optional<Produto> produtoEncontrado = obterPorID(produto.getId());

        if(produtoEncontrado.isEmpty()){
            throw new InputMismatchException("Produto não encontrado");
        }

        //remoce o produtor antigo da lista
        deletar(produto.getId());

        //adiciona novo produto
        produtos.add(produto);

        return produto;
        
        
    }
}
