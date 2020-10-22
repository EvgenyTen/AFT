package main.homework7.task3.Figures;
import main.homework7.task3.chess.Player;
import main.homework7.task3.chess.Position;

import java.util.Set;

public abstract class ChessFigure {
    protected  String name;
    protected  Position position;
    protected Player color;

    public abstract  Set<Position> getAvaibleMoves(){

    }
}
