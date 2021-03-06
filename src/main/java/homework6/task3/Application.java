package homework6.task3;

import homework6.task3.DayOfWeek;
import homework6.task3.Lesson;
import homework6.task3.Scholar;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scholar pupil = new Scholar();
        Map<DayOfWeek, List<Lesson>> diary = new TreeMap<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            diary.put(day, Lesson.generateLessons());
        }
        pupil.setDiary(diary);

        for (Map.Entry<DayOfWeek, List<Lesson>> dayEntry : pupil.getDiary().entrySet()) {
            StringBuilder format = new StringBuilder();
            format.append(dayEntry.getKey().getDay()).append(":");
            for (Lesson lesson : dayEntry.getValue()) {
                format.append(", ").append(lesson.getLessonName());
            }
            String formattedString = format.toString().replaceFirst(",", "");
            System.out.println(formattedString);
        }

        Map<Lesson, Integer> lessonCounters = new HashMap<>();
        for (Lesson lesson : Lesson.values())
            lessonCounters.put(lesson, 0);
        for (List<Lesson> lessons : pupil.getDiary().values()) {
            for (Lesson lesson : lessons) {
                lessonCounters.put(lesson, lessonCounters.get(lesson) + 1);
            }
        }

        int maxLessonAmount = Collections.max(lessonCounters.values());
        int minLessonAmount = Collections.min(lessonCounters.values());
        for (int i = maxLessonAmount; i >= minLessonAmount; i--) {
            for (Map.Entry<Lesson, Integer> entry : lessonCounters.entrySet()) {
                if (entry.getValue() == i)
                    System.out.printf("%s: %d%n", entry.getKey().getLessonName(), entry.getValue());
            }
        }

    }

}
