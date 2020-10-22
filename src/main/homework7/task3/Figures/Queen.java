package main.homework7.task3.Figures;
import main.homework7.task3.chess.Player;
import main.homework7.task3.chess.Position;

import java.util.Set;

public class Queen extends ChessFigure {
    public Queen (Position position) {
        super("Ферзь",position);
    }
    @Override
    public Set<Position> getAvaibleMoves(){

    }

}
