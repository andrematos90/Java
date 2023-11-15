package com.aula.projeto.service;

import com.aula.projeto.model.ProdutoModel;
import com.aula.projeto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    final ProdutoRepository produtoRepository;
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<ProdutoModel> ObterTodosOsProdutos(){
        return produtoRepository.findAll();
    }
    @Transactional
    public ProdutoModel salvarProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public Optional<ProdutoModel> obterProdutoPorId(Integer id) {
        return produtoRepository.findById(id);
    }

    @jakarta.transaction.Transactional
    public void deletarProduto(ProdutoModel produtoModel) {
        produtoRepository.delete(produtoModel);
    }


}
