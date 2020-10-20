package main.homework7.task3.Figures;

import main.homework7.task3.chess.Player;
import main.homework7.task3.chess.Position;

import java.util.Set;

public class King extends ChessFigure{
    public King (Player player, String position) {
        super(player, position);
        figureName="Король";
    }
    @Override
    public Set<Position> getAvaibleMoves(){

    }
}
