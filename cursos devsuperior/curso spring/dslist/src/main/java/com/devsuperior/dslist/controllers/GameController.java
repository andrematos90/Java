package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameMinDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dslist.services.GameService;

import java.util.List;

@RestController //configra a classe como um controlador
@RequestMapping(value = "/games") //mapeia o recurso (url)
public class GameController {
    @Autowired
    private GameService gameService;
    @GetMapping //configura o método como GET
    public ResponseEntity<List<GameMinDTO>> findAll(){
        List<GameMinDTO> gamesDTO = gameService.findAll();

        return  new ResponseEntity<>(gamesDTO, HttpStatus.OK);

    }
}
