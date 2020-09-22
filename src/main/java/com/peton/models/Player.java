package com.peton.models;

public class Player {
    //region Fields

    // A player's id
    private int id;

    // A player's name
    private String name;

    // A player's score
    private int score;

    // A player's game id
    private int gameId;

    //endregion

    //region Constructors

    public Player() {
        this.score = 0;
    }

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public Player(String name, int gameId) {
        this.name = name;
        this.gameId = gameId;
        this.score = 0;
    }

    public Player(String name, int gameId, int id) {
        this.id = id;
        this.name = name;
        this.gameId = gameId;
        this.score = 0;
    }

    //endregion

    //region Accessors

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    //endregion
}
