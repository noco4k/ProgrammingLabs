package org.example;


public class App {
    public static void main(String[] args) {
        Team team1 = new Team("Реал Мадрид", "Футбол", 11);
        Team team2 = new Team("test", "Баскетбол", 5);
        Team team3 = new Team("Канада", "Хоккей", 6);
        Team team4 = new Team("Зенит", "Волейбол", 6);
        Team team5 = new Team("Ред Булл", "Автоспорт", 2);

        System.out.printf("Общее количество команд: %d%n", Team.totalTeams);
        System.out.printf("Общее количество игроков: %d%n", Team.totalPlayers);
        System.out.printf("Среднее число игроков в команде: %.2f%n", Team.getAveragePlayers());
    }
}
