package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {

            Train[] trains = {

                    new Train("101", "Минск — Брест", 8, 3, 120),

                    new Train("202", "Минск — Гомель", 6, 2, 100),

                    new Train("303", "Минск — Витебск", 7, 4, 110)

            };


            System.out.println("Список поездов:");

            for (Train train : trains) train.printInfo();


            System.out.println("\nПокупка и отмена билетов:");

            trains[0].buyTicket();

            trains[0].cancelTicket();


            trains[1].buyTicket();

            trains[1].buyTicket();

            try {

                trains[1].buyTicket();

            } catch (TicketException e) {

                System.out.println("Ошибка билета: " + e.getMessage());

            }


            System.out.println("\nПоиск поезда:");

            try {

                Train.findTrain(trains, "101").printInfo();

                Train.findTrain(trains, "999");

            } catch (TrainNotFoundException e) {

                System.out.println("Ошибка поиска: " + e.getMessage());

            }


            System.out.println("\nПроверка неверных данных:");

            try {

                new Train("404", "Минск — Могилёв", 0, 10, 90);

            } catch (InvalidTrainDataException e) {

                System.out.println("Ошибка создания: " + e.getMessage());

            }

        } catch (InvalidTrainDataException e) {

            System.out.println("Не удалось создать поезд: " + e.getMessage());

        }
    }
}
