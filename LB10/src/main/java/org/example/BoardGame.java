package org.example;

public class BoardGame implements Playable, Saveable {
    private String name;
    private int players;
    private boolean saved;

    public BoardGame(String name, int players) {
        this.name = name;
        this.players = players;
        this.saved = false;
    }

    @Override
    public void play() {
        System.out.println("Играем в настольную игру: " + name);
    }

    @Override
    public void pause() {
        System.out.println("Настольная игра " + name + " приостановлена.");
    }

    @Override
    public void stop() {
        System.out.println("Настольная игра " + name + " завершена.");
    }

    @Override
    public void save() {
        saved = true;
        System.out.println("Настольная игра " + name + " сохранена.");
    }

    @Override
    public void load() {
        if (saved) {
            System.out.println("Сохранение игры " + name + " загружено.");
        } else {
            System.out.println("Нет сохранения игры " + name + ".");
        }
    }

    public void displayInfo() {
        System.out.println("Название: " + name + ", игроков: " + players);
    }
}
