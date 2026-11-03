package org.example;

class Sparrow extends Bird {
    public Sparrow(String name, double wingspan) {
        super(name, "Воробей", wingspan);
    }

    @Override
    public String getFlightStyle() {
        return "Порхающий полет";
    }

    @Override
    public void fly() {
        System.out.println(name + ": Лечу, часто взмахивая крыльями");
    }

    public void fly(String direction) {
        System.out.println(name + ": Порхаю в направлении " + direction);
    }
}