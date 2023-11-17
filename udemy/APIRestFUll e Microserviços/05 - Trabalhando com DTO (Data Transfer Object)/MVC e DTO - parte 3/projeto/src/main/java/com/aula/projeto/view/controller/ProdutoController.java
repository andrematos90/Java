package com.aula.projeto.view.controller;

import com.aula.projeto.dtos.ProdutoDTO;
import com.aula.projeto.model.ProdutoModel;
import com.aula.projeto.service.ProdutoService;
import com.aula.projeto.view.model.ProdutoRequest;
import com.aula.projeto.view.model.ProdutoResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.*;

@RequestMapping("/products")
@RestController
public class ProdutoController {
    private ProdutoService produtoService;
    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

   @PostMapping
    public ResponseEntity<ProdutoResponse> salvaProduto(@RequestBody ProdutoRequest produtoRequest){
        ModelMapper mapper = new ModelMapper();
        ProdutoDTO produtoDTO = mapper.map(produtoRequest, ProdutoDTO.class);

        produtoDTO = produtoService.salvarProduto(produtoDTO);
        return  new ResponseEntity<>(mapper.map(produtoDTO, ProdutoResponse.class), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoResponse>> ObterTodosOsProdutos(){
        List<ProdutoDTO> produtosDTO = produtoService.ObterTodosOsProdutos();

        ModelMapper mapper = new ModelMapper();

        List<ProdutoResponse> produtoResponse = produtosDTO.stream()
                .map(produtoDto -> mapper.map(produtoDto, ProdutoResponse.class))
                .collect(Collectors.toList());
        return  new ResponseEntity<>(produtoResponse, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ProdutoResponse>> obterProdutoPorId(@PathVariable(value = "id") Integer id){
          try{
              Optional<ProdutoDTO> produtoDTO = produtoService.obterProdutoPorId(id);
              ProdutoResponse produtoResponse = new ModelMapper().map(produtoDTO.get(), ProdutoResponse.class);
              return  new ResponseEntity<>(Optional.of(produtoResponse), HttpStatus.OK);

          }catch (Exception e ){
              return new ResponseEntity<>(NO_CONTENT);
          }
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProduto(@PathVariable(value = "id") Integer id){

      produtoService.deletarProduto(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
   @PutMapping("/{id}")
    public ResponseEntity<ProdutoResponse> atualizarProduto(@PathVariable(value = "id")Integer id, @RequestBody ProdutoRequest produtoRequest){
       ModelMapper mapper = new ModelMapper();
       ProdutoDTO produtoDTO = mapper.map(produtoRequest, ProdutoDTO.class);

       produtoDTO = produtoService.atualizarProduto(id, produtoDTO);

       return  new ResponseEntity<>(
               mapper.map(produtoDTO, ProdutoResponse.class),
               HttpStatus.OK);
    }
}


