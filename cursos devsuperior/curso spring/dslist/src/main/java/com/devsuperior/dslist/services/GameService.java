package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // registra como sendo um componente do sistema, permitindo a injeção dependencias
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List <Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;

    }

    @Transactional(readOnly = true) // é utilizada para indicar que um método deve ser envolvido por uma transação
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;

    }

    /* o método retornará um GameDTO (que possui todas as propriedades do game),
    findById(id); é o método do repository no qual é passado um id e ele retorna
    um "optional" para extrarir o Game desse optional usa se o ".get() tudo é
    salvo na variável result que é do tipo Game"

     GameDTO dto = new GameDTO(result);
     converte de Game para o tipo GameDto e salvo na variável dto que é retornada
     */

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List <GameMinProjection> result = gameRepository.searchByList(listId);
        return  result.stream().map(x -> new GameMinDTO(x)).toList();


    }

}
