package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service //registra a classe como um componente de serviço do sistema
public class GameService {
    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

    /*
    @Transactional
    serve para garantir que a operação com o banco vai
    acontecer de acordo com os principios das transações
    readOnly = true)
    assegura que nao sera feita nenhuma operação de  escriota*/
    @Transactional (readOnly = true)
    public GameDTO findById(long id){

        /* passa o id  e pega do repository um objeto do tipo game e salva em "result"
        / precisa do get() pq retorna um optional*/
        Game result = gameRepository.findById(id).get();

        //converte "result" para o tipo GameDto e salva em "gameDto"
        GameDTO gameDto = new GameDTO(result);
        return gameDto;
    }

}
