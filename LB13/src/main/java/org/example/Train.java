package org.example;

public class Train {
    private String number, route;

    private int cars, seats, speed;


    public Train(String number, String route, int cars, int seats, int speed)

            throws InvalidTrainDataException {

        if (number == null || number.isEmpty())

            throw new InvalidTrainDataException("Номер поезда не может быть пустым");

        if (cars <= 0 || seats < 0)

            throw new InvalidTrainDataException("Количество вагонов должно быть больше нуля, мест — не меньше нуля");

        this.number = number;

        this.route = route;

        this.cars = cars;

        this.seats = seats;

        this.speed = speed;

    }


    public String getNumber() {
        return number;
    }


    public void buyTicket() throws TicketException {

        if (seats == 0) throw new TicketException("Свободных мест нет");

        seats--;

        System.out.println("Билет на поезд " + number + " куплен. Осталось мест: " + seats);

    }


    public void cancelTicket() {

        seats++;

        System.out.println("Билет на поезд " + number + " отменён. Свободных мест: " + seats);

    }


    public void printInfo() {

        System.out.println("Поезд №" + number + ", маршрут: " + route

                + ", вагонов: " + cars + ", свободных мест: " + seats

                + ", скорость: " + speed + " км/ч");

    }

    static Train findTrain(Train[] trains, String number) throws TrainNotFoundException {

        for (Train train : trains) {

            if (train.getNumber().equals(number)) return train;

        }

        throw new TrainNotFoundException("Поезд №" + number + " не найден");

    }
}
