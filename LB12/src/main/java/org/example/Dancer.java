package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

class Dancer {
    private final int id;
    private final String name;
    private final String style;
    private int level;
    private final List<Integer> competitionScores;

    public Dancer(int id, String name, String style, int level,
                  List<Integer> competitionScores) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.level = level;
        this.competitionScores = new ArrayList<>(competitionScores);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Integer> getCompetitionScores() {
        return new ArrayList<>(competitionScores);
    }

    public double getAverageScore() {
        if (competitionScores.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int score : competitionScores) {
            sum += score;
        }
        return (double) sum / competitionScores.size();
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
                "ID: %d | Имя: %s | Стиль: %s | Уровень: %d | Средний балл: %.2f",
                id, name, style, level, getAverageScore());
    }

    public static void printDancers(List<Dancer> dancers, int level) {
        System.out.println("\\nТанцоры уровня " + level + ":");
        boolean found = false;
        for (Dancer dancer : dancers) {
            if (dancer.getLevel() == level) {
                System.out.println(dancer);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Танцоры указанного уровня не найдены.");
        }
    }
}
