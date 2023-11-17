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
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProdutoService {
    final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<ProdutoDTO> ObterTodosOsProdutos() {
        //retorna uma lista de produto model
        List<ProdutoModel> produtoModel = produtoRepository.findAll();

        return produtoModel.stream()
                .map(produto -> new ModelMapper().map(produto, ProdutoDTO.class))
                .collect(Collectors.toList());
    }

    public Optional<ProdutoDTO> obterProdutoPorId(Integer id) {
        //obtendo optional de produto pelo id
        Optional<ProdutoModel> produtoModel = produtoRepository.findById(id);
       /*if(produtoModel.isPresent()){
           throw new ResourceNotFoundException("Id do produto não encontrado!");
        }*/

        //convertendo o optional de produto em produtoDTO
        ProdutoDTO produtoDTO = new ModelMapper().map(produtoModel.get(), ProdutoDTO.class);
        return Optional.of(produtoDTO);


    }

    @Transactional
    public ProdutoDTO salvarProduto(ProdutoDTO produtoDTO) {
        //remove o id para conseguir fazer o cadastro
        produtoDTO.setId(null);

        //criar um objeto de mapeamento
        ModelMapper mapper = new ModelMapper();

        //converter de dto para ProdutoModel
        ProdutoModel produtoModel = mapper.map(produtoDTO, ProdutoModel.class);

        //salvar no banco
        produtoModel = produtoRepository.save(produtoModel);
        produtoDTO.setId(produtoModel.getId());

        //retornar um ProdutoDTO atualizado

        return produtoDTO;
    }

    public ProdutoDTO atualizarProduto(Integer id, ProdutoDTO produtoDTO) {
        //passa o id para o produtoDTO
        produtoDTO.setId(id);

        //cria um objeto de mapeamento
        ModelMapper mapper = new ModelMapper();

        //converte o produtoDTO em produtoModel
        ProdutoModel produtoModel = mapper.map(produtoDTO, ProdutoModel.class);

        //atualiza o produto no banco de dados
        produtoRepository.save(produtoModel);
        return produtoDTO;
    }


    @DeleteMapping
    public void deletarProduto(Integer id) {

        //verifica se o produto existe
        Optional<ProdutoModel> produtoModel = produtoRepository.findById(id);

        //se não existir lança uma exception
       /* if(produtoModel.isEmpty()){
            throw new ResourceNotFoundException("id Não encontrado");
        }*/
        produtoRepository.deleteById(id);
    }
}



