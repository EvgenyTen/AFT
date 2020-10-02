package main.homework4.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.text.ParseException;

public class Application {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException, IOException {

        Human[] humans = new Human[2];
        int index = 0;

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку в формате string  string string:");
            String inputString = reader.readLine();

            boolean inputValid = Validator.checkFormat(inputString);
            if (!inputValid) continue;

            String[] humanFields = Validator.separation(inputString);

            Human human = new Human();
            human.setName(humanFields[0]);
            human.setSurname(humanFields[1]);
            human.setBirthDate(sdf.parse(humanFields[2]));

            boolean isHumanValid = Validator.isAllFieldsInitialized(human);
            if (!isHumanValid) continue;

            humans[index++] = human;
            boolean isArrayFull = Validator.isArrayFull(humans);
            if (isArrayFull) break;
        }
    }
}

