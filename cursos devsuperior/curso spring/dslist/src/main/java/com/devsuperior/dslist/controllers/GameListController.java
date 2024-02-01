// Pacote onde a classe está localizada
package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.dto.ReplacemetDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controlador responsável por lidar com as requisições relacionadas às listas de jogos
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    // Injeção automática do serviço GameListService
    @Autowired
    private GameListService gameListService;

    // Injeção automática do serviço GameService
    @Autowired
    private GameService gameService;

    // Endpoint para buscar uma lista de jogos com base no ID da lista
    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        // Chamando o serviço para obter a lista de jogos por ID
        GameListDTO result = gameListService.findById(id);
        return result;
    }

    // Endpoint para buscar todas as listas de jogos
    @GetMapping
    public List<GameListDTO> findAll() {
        // Chamando o serviço para obter todas as listas de jogos
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    // Endpoint para buscar todos os jogos de uma lista com base no ID da lista
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        // Chamando o serviço para obter todos os jogos de uma lista por ID
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    // Endpoint para realizar a operação de movimentação de jogos dentro de uma lista
    @PostMapping(value = "/{listId}/replacement")
    public void mov(@PathVariable Long listId, @RequestBody ReplacemetDTO body) {
        // Chamando o serviço para realizar a operação de movimentação
        gameListService.mov(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
