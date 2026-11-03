package org.example;

public class Bird {
    protected String name;
    protected String species;
    protected double wingspan;

    public Bird(String name, String species, double wingspan) {
        this.name = name;
        this.species = species;
        this.wingspan = wingspan;
    }

    public void fly() {
        System.out.println(name + ": Лечу");
    }

    public void fly(int distance) {
        System.out.println(name + ": Лечу " + distance + " км");
    }

    public void fly(double height) {
        System.out.println(name + ": Лечу на высоте " + height + " м");
    }


    public String getFlightStyle() {
        return "Обычный полет";
    }

    public void displayInfo() {
        System.out.println("Имя: " + name
                + ", вид: " + species
                + ", размах крыльев: " + wingspan + " м");
    }
}
