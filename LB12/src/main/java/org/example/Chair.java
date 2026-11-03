package org.example;

public class Chair extends Furniture {
    private boolean backrest;

    public Chair(String name, int id, String material, boolean backrest) {
        super(name, id, material);
        this.backrest = backrest;
    }

    @Override
    public String toString() {
        return "Стул [" + super.toString() +
                ", наличие спинки: " + (backrest ? "да" : "нет") + "]";
    }
}
