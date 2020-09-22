package com.peton.services;

import com.peton.exceptions.ItemNotFoundException;
import com.peton.models.Game;
import com.peton.models.Shape;

import java.util.ArrayList;
import java.util.List;

public class GameService {

    //region Fields

    // The list of games
    private List<Game> games;

    // The lowest available id
    private static int lowestId = 1;

    //endregion

    //region Constructors

    public GameService() {
        this.games = new ArrayList<>();
    }

    //endregion

    //region Methods

    public List<Game> findAll() {
        return games;
    }

    public Game findById(int id) {
        return games.stream().filter(g -> g.getId() == id).findFirst().orElseThrow(ItemNotFoundException::new);
    }

    public void add(Game game) {
        game.setId(lowestId++);
        games.add(game);
    }

    public void edit(int id, Game game) {
        Game gameToEdit = games.stream().filter(g -> g.getId() == id).findFirst().orElseThrow(ItemNotFoundException::new);
        gameToEdit.setPlayers(game.getPlayers());
        gameToEdit.setGameShapes(game.getGameShapes());
    }

    public void deleteById(int id) {
        games.removeIf(g -> g.getId() == id);
    }

    //endregion
}
