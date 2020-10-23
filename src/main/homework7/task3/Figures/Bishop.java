package main.homework7.task3.Figures;

import main.homework7.task3.chess.Player;
import main.homework7.task3.chess.Position;

import java.util.Set;

public class Bishop extends ChessFigure {
    public Bishop(Position position) {
        super("Слон",position);
    }
    @Override
    public Set<Position> getAvaibleMoves(){
   return null;
    }

}