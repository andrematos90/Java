package com.aula.projeto.service;

import com.aula.projeto.model.ProdutoModel;
import com.aula.projeto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private ProdutoRepository produtoRepository;
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }
    @Transactional
    public ProdutoModel save(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public Optional<ProdutoModel> findById(Integer id) {
        return produtoRepository.findById(id);
    }

    @jakarta.transaction.Transactional
    public void delete(ProdutoModel produtoModel) {
        produtoRepository.delete(produtoModel);
    }
}
