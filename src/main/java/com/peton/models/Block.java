package com.peton.models;

import java.awt.*;

public class Block {
    //region Fields

    // A block's id
    private int id;

    // A block's position
    private Point pos;

    // A block's shape id
    private int shapeId;

    //endregion

    //region Constructors

    public Block() { }

    public Block(Point pos) {
        this.pos = pos;
    }

    public Block(int x, int y) {
        this.pos = new Point(x, y);
    }

    public Block(Point pos, int shapeId) {
        this.pos = pos;
        this.shapeId = shapeId;
    }

    public Block(Point pos, int shapeId, int id) {
        this.id = id;
        this.pos = pos;
        this.shapeId = shapeId;
    }

    //endregion

    //region Accessors

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getPos() {
        return pos;
    }

    public void setPos(Point pos) {
        this.pos = pos;
    }

    public int getShapeId() {
        return shapeId;
    }

    public void setShapeId(int shapeId) {
        this.shapeId = shapeId;
    }

    //endregion
}
