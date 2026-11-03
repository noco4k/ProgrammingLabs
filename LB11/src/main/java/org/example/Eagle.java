package org.example;

public class Eagle extends Bird {
    public Eagle(String name, double wingspan) {
        super(name, "Орёл", wingspan);
    }

    @Override
    public String getFlightStyle() {
        return "Парящий полет";
    }

    @Override
    public void fly() {
        System.out.println(name + ": Лечу, используя парящий полет");
    }

    public void fly(String direction) {
        System.out.println(name + ": Лечу в направлении " + direction);
    }
}


