package main.homework7.task3.Figures;

import main.homework7.task3.chess.Player;
import main.homework7.task3.chess.Position;

import java.util.Set;

public class Knight extends ChessFigure{
    public Knight(Position position) {
        super("Конь",position);
    }
    @Override
    public Set<Position> getAvaibleMoves(){

    }
}
