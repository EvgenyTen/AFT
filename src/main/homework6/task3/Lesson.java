package main.homework6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Lesson {
    MATHS, PHYSICS, PROGRAMMING, HISTORY, BIOLOGY, GEOGRAPHY;

    public String lessonName;

    Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    Lesson() {
        this.lessonName = lessonName;
    }

    public static List<Lesson> generateLessons() {
        List<Lesson> lessonsList = new ArrayList<>();
        int lessonAmount = new Random().nextInt(3) + 4;
        for (int i = 0; i < lessonAmount; i++) {
            lessonsList.add(values()[new Random().nextInt(values().length)]);
        }
        return lessonsList;
    }
}
