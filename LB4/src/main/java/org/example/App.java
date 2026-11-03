package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (true) {

            System.out.println("1. Класс телефон");
            System.out.println("2. Класс Парк");
            System.out.println("3. Класс Закан с enum");
            System.out.println("0. Выход из программы");
            System.out.print("Выберите пункт меню: ");

            String a = in.nextLine();

            switch (a) {
                case "1":
                    SmartPhone smartPhone = new SmartPhone("Sony", 8, 20);
                    System.out.println(smartPhone.isGoodBattery());
                    break;

                case "2":
                    Park[] parkArr = new Park[]{new Park("Лошицкий парк", 3000.3, 111),
                            new Park("Парк горикова", 2314, 123),
                            new Park("test1", 2321, 345),
                            new Park("test2", 223, 41),
                            new Park("test3", 324, 42),
                            new Park("test4", 2133, 421)};
                    double maxArea = 0;
                    int indexOfArea = -1;

                    for (int i = 0; i < parkArr.length; i++) {
                        if (parkArr[i].getArea() > maxArea) {
                            maxArea = parkArr[i].getArea();
                            indexOfArea = i;
                        }
                    }
                    System.out.println("Парк с самой большой площадью" + parkArr[indexOfArea].getName());
                    break;
                case "3":
                    Order[] orderArr = new Order[]{new Order(1, OrderStatus.PENDING),
                            new Order(2, OrderStatus.SHIPPED),
                            new Order(3, OrderStatus.DELIVERED),
                            new Order(4, OrderStatus.SHIPPED),
                            new Order(5, OrderStatus.SHIPPED)};
                    for (int i = 0; i < orderArr.length; i++) {
                        if (orderArr[i].getStatus() == OrderStatus.SHIPPED) {
                            System.out.println(orderArr[i]);
                        }
                    }
                    System.out.println(orderArr[0]);
                    break;
                case "0":
                    System.out.println("Завершение работы программы.");
                    return;

                default:
                    System.out.println("Ошибка выбора");
                    break;
            }
        }
    }
}
