package org.example;


public class App {
    public static void main(String[] args) {
        Music music = new RockSong(
                "Nothing Else Matters", "Metallica", 388, true
        );
        RockSong rock = new RockSong(
                "Nothing Else Matters", "Metallica", 388, true
        );
        music.getGenre();
        rock.getGenre();
        music.test();
        rock.test();
        ClassicalSong classical = new ClassicalSong(
                "Лунная соната", "Людвиг ван Бетховен", 900,
                "Симфонический оркестр"
        );

        System.out.println("Рок-композиция");
        rock.displayInfo();
        rock.playSolo();

        System.out.println();

        System.out.println("Классическая композиция");
        classical.displayInfo();
        classical.conduct();
    }
}
