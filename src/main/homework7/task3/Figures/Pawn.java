package main.homework7.task3.Figures;

import main.homework7.task3.chess.Player;
import main.homework7.task3.chess.Position;

import java.util.Set;

public class Pawn extends ChessFigure{
    public Pawn(Position position) {
        super("Пешка",position);
    }

    @Override
    public Set<Position> getAvaibleMoves(){

    }
}
