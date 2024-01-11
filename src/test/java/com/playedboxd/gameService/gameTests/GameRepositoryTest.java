package com.playedboxd.gameService.gameTests;

import com.playedboxd.gameService.dataAccess.abstracts.GameRepository;
import com.playedboxd.gameService.entities.concretes.Game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@DataJpaTest
public class GameRepositoryTest {


    @Autowired
    private GameRepository gameRepository;



    @Test
    public void findGameIdEqualsToOneShouldReturnGenreEqualsToActionTest() {
       Optional<Game> optionalGame = gameRepository.findById(1);
        Assertions.assertTrue(optionalGame.isPresent());

        Game foundGame = optionalGame.get();
        Assertions.assertEquals("Action", foundGame.getGenre().getGenreName());

    }


    @Test
    public void findGenreNameEqualsToActionReturnTitleMustBeGodOfWarTest() {
        Optional<Game> optionalGame = gameRepository.findByGenre_GenreName("Action");
        Assertions.assertTrue(optionalGame.isPresent());

        List<Game> gamesByGenreName = Collections.singletonList(optionalGame.get());

        for (Game game : gamesByGenreName) {
            Assertions.assertEquals("God of War", game.getTitle());
        }
    }


}
