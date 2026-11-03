package org.example;

import java.util.*;


public class App {
    public static void runDancers() {
        List<Dancer> dancers = new ArrayList<>(Arrays.asList(
                new Dancer(1, "Анна", "Хип-хоп", 1, Arrays.asList(4, 5, 4)),
                new Dancer(2, "Иван", "Брейк-данс", 2, Arrays.asList(2, 3, 2)),
                new Dancer(3, "Мария", "Балет", 2, Arrays.asList(5, 4, 5)),
                new Dancer(4, "Денис", "Хип-хоп", 1, Arrays.asList(3, 3, 3)),
                new Dancer(5, "Ольга", "Современный танец", 3, Arrays.asList(4, 4, 5)),
                new Dancer(6, "Павел", "Брейк-данс", 1, Arrays.asList(1, 2, 2)),
                new Dancer(7, "Елена", "Балет", 2, Arrays.asList(4, 4, 4)),
                new Dancer(8, "Артём", "Современный танец", 2, Arrays.asList(5, 5, 4))
        ));

        Iterator<Dancer> iterator = dancers.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getAverageScore() < 3) {
                iterator.remove();
            }
        }


        for (Dancer dancer : dancers) {
            if (dancer.getAverageScore() >= 4) {
                dancer.setLevel(dancer.getLevel() + 1);
            }
        }

        Dancer.printDancers(dancers, 2);


        dancers.sort(
                Comparator.comparingDouble(Dancer::getAverageScore)
                        .reversed()
                        .thenComparing(Dancer::getName)
        );

        System.out.println("\nИтоговый список танцоров:");

        for (Dancer dancer : dancers) {
            System.out.printf("%d | %s | %.2f%n",
                    dancer.getId(),
                    dancer.getName(),
                    dancer.getAverageScore());
        }
    }

    public static void runFurniture() {
        Map<String, Furniture> furniture = new HashMap<>();

        furniture.put("Обеденный стол",
                new Table("Обеденный стол", 1, "Дерево", 4));

        furniture.put("Компьютерный стол",
                new Table("Компьютерный стол", 2, "ДСП", 4));

        furniture.put("Журнальный стол",
                new Table("Журнальный стол", 3, "Стекло", 3));

        furniture.put("Кухонный стул",
                new Chair("Кухонный стул", 4, "Дерево", true));

        furniture.put("Офисный стул",
                new Chair("Офисный стул", 5, "Металл и ткань", true));

        furniture.put("Табурет",
                new Chair("Табурет", 6, "Дерево", false));

        furniture.put("Книжный шкаф",
                new Wardrobe("Книжный шкаф", 7, "Дерево", 2));

        furniture.put("Платяной шкаф",
                new Wardrobe("Платяной шкаф", 8, "ДСП", 3));

        System.out.println("\nСписок мебели:");

        for (Map.Entry<String, Furniture> entry : furniture.entrySet()) {
            System.out.println("Ключ: " + entry.getKey());
            System.out.println("Значение: " + entry.getValue());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание:");
        System.out.println("1 — Танцоры");
        System.out.println("2 — Мебель");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                runDancers();
                break;

            case 2:
                runFurniture();
                break;

            default:
                System.out.println("Ошибка: такого задания нет.");
        }

        scanner.close();
    }
}
