package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository  extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
	List<GameMinProjection> searchByList(Long listId);
}

/*

pra fazer uma consulta pernsonalizada, escreve se o método e assina se ele com
<GameMinProjection> e e colocasse de paramentro o que sera preciso para a consulta
no caso o id da lista, o parametro vai para  ":listId" na query

nativeQuery é usada para que a consulta SQL funncione e nao JPQl que é uma linguagem
de consulta da JPA, quando se usa nativeQuery o resultado da consulta tem que ser
uma interface que no spring é chamada de "Projection"

*/
