package com.aula.projeto.controller;

import com.aula.projeto.dtos.ProdutoDTO;
import com.aula.projeto.model.ProdutoModel;
import com.aula.projeto.service.ProdutoService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.*;

@RequestMapping("api/podutos")
@RestController
public class ProdutoController {
    private ProdutoService produtoService;
    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<Object> salvarProduto(@RequestBody ProdutoDTO produtoDTO){
        var produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produtoDTO, produtoModel);
        return ResponseEntity.status(CREATED).body(produtoService.save(produtoModel));
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> ObterTodosOsProdutos(){
        return ResponseEntity.status(OK).body(produtoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obterProdutoPorId(@PathVariable(value = "id") Integer id){
        Optional<ProdutoModel> produtoModelOptional = produtoService.findById(id);
        if(!produtoModelOptional.isPresent()){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id não encontrado!");
        }
        return ResponseEntity.status(OK).body(produtoModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletaProduto(@PathVariable(value = "id") Integer id){
        Optional<ProdutoModel> produtoModelOptional = produtoService.findById(id);
        if (!produtoModelOptional.isPresent()){
            return ResponseEntity.status(NOT_FOUND).body("Id não encontrado!");
        }
        produtoService.delete(produtoModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto excluido com sucesso!");
    }

    @PutMapping
    public ResponseEntity<Object> atualizarProduto(@PathVariable(value = "id")Integer id, @RequestBody ProdutoDTO produtoDTO){
        Optional<ProdutoModel> produtoModelOptional = produtoService.findById(id);
        if(!produtoModelOptional.isPresent()){
            return ResponseEntity.status(NOT_FOUND).body("Registro não encotrado!");
        }
        var produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produtoDTO, produtoModel);
        produtoModel.setId(produtoModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.save(produtoModel));
    }

}
