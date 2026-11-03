package org.example;

public class Park {
    private String name;
    private double area;
    private int trees;

    public Park(String name, double area, int trees) {
        this.name = name;
        this.area = area;
        this.trees = trees;
    }

    public String getName() {
        return this.name;
    }

    public double getArea() {
        return this.area;
    }

    public int getTrees() {
        return this.trees;
    }
}
