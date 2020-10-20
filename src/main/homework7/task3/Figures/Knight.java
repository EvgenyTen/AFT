package main.homework7.task3.Figures;

import main.homework7.task3.chess.Player;
import main.homework7.task3.chess.Position;

import java.util.Set;

public class Knight extends ChessFigure{
    public Knight(Player player, String position) {
        super(player, position);
        figureName="Конь";
    }
    @Override
    public Set<Position> getAvaibleMoves(){

    }
}
