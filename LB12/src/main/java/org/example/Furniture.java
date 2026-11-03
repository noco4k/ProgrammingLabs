package org.example;

public class Furniture {
    protected String name;
    protected int id;
    protected String material;

    public Furniture(String name, int id, String material) {
        this.name = name;
        this.id = id;
        this.material = material;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", название: " + name +
                ", материал: " + material;
    }
}
