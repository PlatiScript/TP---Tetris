package com.peton.models;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Game {
    //region Fields

    // A game's id
    private int id;

    // A game's list of shapes
    private List<GameShape> gameShapes;

    // A game's list of players
    private List<Player> players;

    // Whether or not a game is finished
    private boolean finished;

    //endregion

    //region Constructors

    public Game() {
        this.gameShapes = new ArrayList<>();
        this.players = new ArrayList<>();
        this.finished = false;
    }

    public Game(List<Player> players) {
        this.gameShapes = new ArrayList<>();
        this.players = players;
        this.finished = false;
    }

    public Game(List<Player> players, int id) {
        this.id = id;
        this.gameShapes = new ArrayList<>();
        this.players = players;
        this.finished = false;
    }

    //endregion

    //region Accessors

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<GameShape> getGameShapes() {
        return gameShapes;
    }

    public void setGameShapes(List<GameShape> gameShapes) {
        this.gameShapes = gameShapes;
    }

    public List<Shape> getShapes() {
        return (List<Shape>) gameShapes.stream().map(GameShape::getShape);
    }

    public void setShapes(List<Shape> shapes) {
        gameShapes = new ArrayList<>();
        shapes.forEach(s -> gameShapes.add(new GameShape(this, s)));
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    //endregion
}
