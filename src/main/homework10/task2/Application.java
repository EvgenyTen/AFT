package main.homework10.task2;

import java.awt.*;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        List generatedContent=new ArrayList<>();

        for(int i = 0; i< Config.LINES_AMOUNT; i++){
            generatedContent.add(StringHelper.generate());
        }
        FileHelper.write(generatedContent);
    }
}