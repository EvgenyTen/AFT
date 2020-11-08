package main.homework10.task4;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        new SalaryDocument().generate().save();
        new CashDocument().generate().save();

    }
}