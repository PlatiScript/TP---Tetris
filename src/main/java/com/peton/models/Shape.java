package com.peton.models;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    //region Fields

    // A shape's id
    private int id;

    // A shape's name
    private String name;

    // A shape's list of blocks
    private List<Block> blocks;

    //endregion

    //region Constructors

    public Shape() {
        this.blocks = new ArrayList<>();
    }

    public Shape(String name) {
        this.name = name;
        this.blocks = new ArrayList<>();
    }

    public Shape(String name, List<Block> blocks) {
        this.name = name;
        this.blocks = blocks;
    }

    public Shape(String name, List<Block> blocks, int id) {
        this.id = id;
        this.name = name;
        this.blocks = blocks;
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

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    //endregion
}
