package org.example;


public class App {
    public static void main(String[] args) {
        EducationalInstitution[] institutions = {
                new School("Школа №1", "Ленина, 10", 800, 11),
                new School("Школа №2", "Мира, 15", 650, 11),
                new School("Школа №3", "Центральная, 5", 500, 11),
                new University("БГУ", "Независимости, 4", 20000, 16),
                new University("БНТУ", "Независимости, 65", 15000, 17)
        };

        for (EducationalInstitution institution : institutions) {
            institution.displayInfo();
            System.out.println("////////////////////////////////////////");
            institution.
        }
    }
}
