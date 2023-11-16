package com.aula.projeto.service;

import com.aula.projeto.dtos.ProdutoDTO;
import com.aula.projeto.model.ProdutoModel;
import com.aula.projeto.repository.ProdutoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProdutoService {
    final ProdutoRepository produtoRepository;
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<ProdutoDTO> ObterTodosOsProdutos(){
        List<ProdutoDTO> produtoDTO = produtoRepository.findAll();

        return produtoModels.stream()
                .map(produto -> new ModelMapper().map(produtoModels, ProdutoDTO.class))
                .collect(Collectors.toList());
    }
    @Transactional
    public ProdutoDTO salvarProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public Optional<ProdutoDTO> obterProdutoPorId(Integer id) {
        Optional<ProdutoModel> produtoModel = produtoRepository.findById(id);
        ProdutoDTO produtoDTO = new ModelMapper().map(produtoModel.get(), ProdutoDTO.class);
        return Optional.of(produtoDTO);
    }

    @jakarta.transaction.Transactional
    public void deletarProduto(ProdutoModel produtoModel) {
        produtoRepository.delete(produtoModel);
    }


}
