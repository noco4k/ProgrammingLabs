package org.example;

public class VideoGame implements Playable, Saveable {
    private String name;
    private String platform;
    private boolean saved;

    public VideoGame(String name, String platform) {
        this.name = name;
        this.platform = platform;
        this.saved = false;
    }

    @Override
    public void play() {
        System.out.println("Запущена видеоигра: " + name);
    }

    @Override
    public void pause() {
        System.out.println("Видеоигра " + name + " приостановлена.");
    }

    @Override
    public void stop() {
        System.out.println("Видеоигра " + name + " завершена.");
    }

    @Override
    public void save() {
        saved = true;
        System.out.println("Видеоигра " + name + " сохранена.");
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
        System.out.println("Название: " + name + ", платформа: " + platform);
    }
}
