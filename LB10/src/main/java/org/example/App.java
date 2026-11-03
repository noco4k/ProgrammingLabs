package org.example;


public class App {
    public static void main(String[] args) {
        Playable[] games = {
                new BoardGame("Монополия", 4),
                new BoardGame("Шахматы", 2),
                new BoardGame("Мафия", 8),
                new VideoGame("Minecraft", "PC"),
                new VideoGame("The Witcher 3", "PC")
        };

        for (Playable game : games) {
            game.play();
            game.pause();
            game.stop();

            if (game instanceof Saveable) {
                Saveable saveable = (Saveable) game;
                saveable.save();
                saveable.load();
            }

            System.out.println("/////////////////////////////////////");
        }
    }
}

