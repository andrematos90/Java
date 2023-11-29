package services;

import dto.GameMinDTO;
import entities.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repositories.GameRepository;

import java.util.List;

@Service //registra a classe como um componente de serviço do sistema
public class GameService {

    private GameRepository gameRepository;

    /*faz a injeção de uma instancia de GameRepository no GameService ou pode apenas
    usar a notação @Autowired em private GameRepository gameRepository;*/
    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }
    public List<Games> findAll(){
        List<Games> result = gameRepository.findAll();
        return result;

    }

}
