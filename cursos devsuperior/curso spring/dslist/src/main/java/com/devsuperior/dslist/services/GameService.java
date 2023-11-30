package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dslist.repositories.GameRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service //registra a classe como um componente de serviço do sistema
public class GameService {
    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
    public List<GameMinDTO> findAll(){
        List<Game> gameModel = gameRepository.findAll();
        return gameModel.stream()
                .map(game -> new ModelMapper().map(game, GameMinDTO.class))
                .collect(Collectors.toList());

    }

}
