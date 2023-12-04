package com.aula.projeto.view.controller;

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

@RequestMapping("/products")
@RestController
public class ProdutoController {
    private ProdutoService produtoService;
    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

   /* @PostMapping
    public ResponseEntity<Object> salvaProduto(@RequestBody ProdutoDTO produtoDTO){

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(produtoService.salvarProduto(produtoDTO));
    }*/

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> ObterTodosOsProdutos(){
        return ResponseEntity.status(OK).body(produtoService.ObterTodosOsProdutos());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obterProdutoPorId(@PathVariable(value = "id") Integer id){


        return ResponseEntity.status(OK).body(produtoService.obterProdutoPorId(id));
    }
/*


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarProduto(@PathVariable(value = "id") Integer id){
        Optional<ProdutoModel> produtoModelOptional = produtoService.obterProdutoPorId(id);
        if (!produtoModelOptional.isPresent()){
            return ResponseEntity.status(NOT_FOUND).body("Id não encontrado!");
        }
        produtoService.deletarProduto(produtoModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto excluido com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarProduto(@PathVariable(value = "id")Integer id, @RequestBody ProdutoDTO produtoDTO){
        Optional<ProdutoModel> produtoModelOptional = produtoService.obterProdutoPorId(id);
        if(!produtoModelOptional.isPresent()){
            return ResponseEntity.status(NOT_FOUND).body("Registro não encotrado!");
        }
        var produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produtoDTO, produtoModel);
        produtoModel.setId(produtoModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.salvarProduto(produtoModel));
    }

 */

}

//controller vai estrabalhar
