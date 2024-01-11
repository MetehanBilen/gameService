package com.playedboxd.gameService.dataAccess.abstracts;

import com.playedboxd.gameService.entities.concretes.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface GameRepository extends JpaRepository<Game,Integer> {

    Optional<Game> findByGenre_GenreName(String genre);

}
