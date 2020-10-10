package main.homework6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Lesson {
    MATH("Математика"),
    PHYSICS("Физика"),
    PROGRAMMING("Программирование"),
    HISTORY("История"),
    BIOLOGY("Биология"),
    GEOGRAPHY("География");

    public String lessonName;

    Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
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
