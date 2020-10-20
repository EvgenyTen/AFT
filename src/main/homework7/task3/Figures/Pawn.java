package main.homework7.task3.Figures;

import main.homework7.task3.chess.Player;
import main.homework7.task3.chess.Position;

import java.util.Set;

public class Pawn extends ChessFigure{
    public Pawn(Player player, String position) {
        super(player, position);
        figureName="Пешка";
    }
    @Override
    public Set<Position> getAvaibleMoves(){

    }
}
