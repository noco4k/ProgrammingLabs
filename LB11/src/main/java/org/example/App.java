package org.example;


public class App {
    public static void main(String[] args) {
        Bird bird = new Bird("Птица", "Неизвестный вид", 0.5);
        Eagle eagle = new Eagle("Орел", 2.1);
        Sparrow sparrow = new Sparrow("Воробей", 0.25);

        System.out.println("Перегрузка методов");
        bird.fly();
        bird.fly(15);
        bird.fly(120.5);
        eagle.fly("север");
        sparrow.fly("сад");

        System.out.println("\nПереопределение и полиморфизм");
        Bird[] birds = {bird, eagle, sparrow};
        for (Bird currentBird : birds) {
            currentBird.displayInfo();
            currentBird.fly();
            System.out.println("Стиль полета: " + currentBird.getFlightStyle());
            System.out.println();
        }

        System.out.println("Сравнение стилей полета");
        System.out.println(eagle.name + ": " + eagle.getFlightStyle());
        System.out.println(sparrow.name + ": " + sparrow.getFlightStyle());
    }
}
