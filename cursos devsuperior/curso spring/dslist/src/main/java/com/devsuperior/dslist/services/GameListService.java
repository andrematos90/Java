// Importação de pacotes e classes necessárias
package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// Marcando esta classe como um serviço Spring
@Service
public class GameListService {

    // Injeção automática do GameListRepository para operações de banco de dados
    @Autowired
    private GameListRepository gameListRepository;

    // Injeção automática do GameRepository para operações de banco de dados
    @Autowired
    private GameRepository gameRepository;

    // Método transacional para recuperar todas as entidades GameList e convertê-las em DTOs
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        // Recuperando todas as entidades GameList do banco de dados
        List<GameList> result = gameListRepository.findAll();
        // Convertendo cada entidade para GameListDTO usando stream e mapeamento
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

    // Método transacional para mover uma entidade Game dentro de uma GameList
    @Transactional()
    public void mov(Long listId, int sourceIndex, int destinationIndex) {
        // Recuperando uma lista de GameMinProjection do GameRepository com base no listId
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        // Removendo o GameMinProjection no sourceIndex e adicionando-o no destinationIndex
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        // Determinando o índice mínimo e máximo entre sourceIndex e destinationIndex
        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        // Atualizando as posições de pertencimento no banco de dados para os objetos/games movidos
        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
            //id da lista, list.get(i) pega o index do jogo, .getId() pega o id do jogo,"i" é a nova posição do jogo
        }
    }

    // Método transacional para buscar uma GameListDTO com base no ID
    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        // Recuperando a entidade GameList do banco de dados com base no ID
        GameList entity = gameListRepository.findById(id).get();
        // Convertendo a entidade para GameListDTO
        return new GameListDTO(entity);
    }
}
