package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/listgames")
public class GameListController {


    private GameListService gameListService;
    private GameService gameService;
    public GameListController(GameListService gameListService){
        this.gameListService = gameListService;
    }
    public GameListController(GameService gameListgameServiceService){
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameListDTO> findAllList(){
        List<GameListDTO> gameListDTO = gameListService.findAll();
        return  gameListDTO;
    }

    /*este método vai chamar o método "findByList" que é de "GameService"
    e não de "GameListService", pq a consulta retorna um game e não uma lista
    de games*/
    @GetMapping(value= "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> gameMinDTO = gameService.findByList(listId);
        return  gameMinDTO;

    }
}
