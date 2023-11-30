package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.services.GameListService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
