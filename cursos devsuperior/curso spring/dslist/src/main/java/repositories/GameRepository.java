package repositories;

import entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Games, Long> {
}

//JpaRepository<Games, Long>  tipo da entidade e tipo do id


