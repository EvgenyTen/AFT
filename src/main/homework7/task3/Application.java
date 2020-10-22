package main.homework7.task3;

import main.homework7.task3.chess.Chess;
import main.homework7.task3.chess.Position;

import java.util.Set;

public class Application {
    public static void main(String[] args) {
       Set<Position> allPositions= Chess.getAll();
        for (Position pos:allPositions) {
            System.out.println(pos);
        }
        System.out.println(allPositions.size());
    }
}
