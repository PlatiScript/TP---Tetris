package com.peton.services;

import com.peton.exceptions.ItemNotFoundException;
import com.peton.models.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeService {

    //region Fields

    // The list of available shapes
    private final List<Shape> shapes;

    // The lowest available id
    private static int lowestId = 1;

    //endregion

    //region Constructors

    public ShapeService() {
        this.shapes = new ArrayList<>();
    }

    //endregion

    //region Methods

    public List<Shape> findAll() {
        return shapes;
    }

    public Shape findById(int id) {
        return shapes.stream().filter(s -> s.getId() == id).findFirst().orElseThrow(ItemNotFoundException::new);
    }

    public void add(Shape shape) {
        shape.setId(lowestId++);
        shapes.add(shape);
    }

    public void edit(int id, Shape shape) {
        Shape shapeToEdit = shapes.stream().filter(s -> s.getId() == id).findFirst().orElseThrow(ItemNotFoundException::new);
        shapeToEdit.setName(shape.getName());
        shapeToEdit.setBlocks(shape.getBlocks());
    }

    public void deleteById(int id) {
        shapes.removeIf(s -> s.getId() == id);
    }

    //endregion
}
