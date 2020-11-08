package homework7.task3;

import homework7.task3.figures.*;
import homework7.task3.chess.Position;

import java.util.Set;

public class Application {

    public static void main(String[] args) {
        Position position = new Position("A4");
        ChessFigure figure = new King(position);
        Set<Position> kingAvailableMoves = figure.getAvaibleMoves();
        System.out.println("Король");
        System.out.println(kingAvailableMoves);

        Position positionPawn = new Position("A2");
        ChessFigure figurePawn = new Pawn(position);
        Set<Position> pawnAvailableMoves = figure.getAvaibleMoves();
        System.out.println("Пешка");
        System.out.println(pawnAvailableMoves);

        Position positionRook = new Position("A1");
        ChessFigure figureRook = new Rook(position);
        Set<Position> rookAvailableMoves = figure.getAvaibleMoves();
        System.out.println("Ладья");
        System.out.println(rookAvailableMoves);

        Position positionQueen = new Position("C1");
        ChessFigure figureQueen = new Queen(position);
        Set<Position> queenAvailableMoves = figure.getAvaibleMoves();
        System.out.println("Ладья");
        System.out.println(queenAvailableMoves);

        Position positionBishop = new Position("G1");
        ChessFigure figureBishop = new Bishop(position);
        Set<Position> bishopAvailableMoves = figure.getAvaibleMoves();
        System.out.println("Слон");
        System.out.println(bishopAvailableMoves);

        Position positionKnight = new Position("G1");
        ChessFigure figureKnight = new Knight(position);
        Set<Position> knightAvailableMoves = figure.getAvaibleMoves();
        System.out.println("Конь");
        System.out.println(knightAvailableMoves);
    }
}
