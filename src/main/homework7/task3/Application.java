package main.homework7.task3;

import main.homework7.task3.Figures.ChessFigure;
import main.homework7.task3.Figures.King;
import main.homework7.task3.chess.Chess;
import main.homework7.task3.chess.Position;

import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Position position=new Position("A4");
        ChessFigure figure=new King(position);
        Set <Position> kingAvailableMoves=figure.getAvaibleMoves();
        System.out.println();
    }
}
