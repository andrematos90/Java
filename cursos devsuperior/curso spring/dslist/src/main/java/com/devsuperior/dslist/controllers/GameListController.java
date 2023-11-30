package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/listgames")
public class GameListController {


    private GameListService gameListService;
    public GameListController(GameListService gameListService){
        this.gameListService = gameListService;
    }
    @GetMapping
    public List<GameListDTO> findAllList(){
        List<GameListDTO> gameListDTO = gameListService.findAll();
        return  gameListDTO;
    }
}
