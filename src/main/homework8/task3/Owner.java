package main.homework8.task3;

public enum Owner {
    QIWI("OOO <<Киви>> "),
    ELEKSNET("OOO <<Элекснет>> "),
    TINKOFF("АO <<Тинькофф>> ");

    Owner(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
