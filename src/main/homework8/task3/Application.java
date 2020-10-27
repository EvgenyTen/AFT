package main.homework8.task3;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Terminal> list = Arrays.asList(
                new QiwiTerminal("г. Москва, ул. Проходчиков, д.3"),
                new EleksnetTerminal("г. Москва, Измайловский пр-т, 73/2"),
                new EleksnetTerminal("г. Москва, ул. Бакунинская, д.1"),
                new EleksnetTerminal("г. Новосибирск, ул. Героев-Десантников, д. 4"),
                new TinkoffTerminal("г. Москва, Ленинградский пр-т, д. 15")
        );

        for (Terminal terminal : list) terminal.pay("+79090224489", 200);

    }
}
