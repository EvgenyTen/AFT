package main.homework7.task3.Figures;

import main.homework7.task3.chess.Player;
import main.homework7.task3.chess.Position;

import java.util.Set;

public class Rook extends ChessFigure{
    public Rook(Position position) {
        super("Ладья",position);
    }

    @Override
    public Set<Position> getAvaibleMoves() {
        return null;
    }
}
