package com.peton.models;

import java.awt.*;

public class GameShape {

    //region Fields

    // The related game
    private Game game;

    // The related shape
    private Shape shape;

    // The shape's position in the game
    private Point pos;

    //endregion


    //region Constructors

    public GameShape() { }

    public GameShape(Game game, Shape shape) {
        this.game = game;
        this.shape = shape;
    }

    //endregion

    //region Accessors

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Point getPos() {
        return pos;
    }

    public void setPos(Point pos) {
        this.pos = pos;
    }

    //endregion
}
