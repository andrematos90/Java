package com.aula.projeto.service;

import com.aula.projeto.dtos.ProdutoDTO;
import com.aula.projeto.model.ProdutoModel;
import com.aula.projeto.repository.ProdutoRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
      List<ProdutoModel> produtoModel = produtoRepository.findAll();

        return produtoModel.stream()
                .map(produto -> new ModelMapper().map(produtoModel, ProdutoDTO.class))
                .collect(Collectors.toList());
    }

    public Optional<ProdutoDTO> obterProdutoPorId(Integer id) {
        Optional<ProdutoModel> produtoModel = produtoRepository.findById(id);
       /*if(produtoModel.isPresent()){
           throw new ResourceNotFoundException("Id do produto não encontrado!");
        }*/
        ProdutoDTO produtoDTO = new ModelMapper().map(produtoModel.get(), ProdutoDTO.class);
        return Optional.of(produtoDTO);
    }

   /* @Transactional
    public ProdutoDTO salvarProduto(ProdutoDTO produtoDTO){
        produtoDTO.setId(nuull);

        return produtoRepository.save(produtoDTO);
    }



    @jakarta.transaction.Transactional
    public void deletarProduto(ProdutoDTO produtoDTO) {
        produtoRepository.delete(produtoDTO);
    }

    public ProdutoDTO atualizarProduto(Integer id, ProdutoDTO produtoDTO){
        produto.setId(id);
        return produtoRepository.save(produtoDTO);
    }*/

}
