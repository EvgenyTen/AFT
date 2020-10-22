package main.homework7.task3.Figures;
import main.homework7.task3.chess.Player;
import main.homework7.task3.chess.Position;

import java.util.Set;

public abstract class ChessFigure {
    protected  String name;
    protected  Position position;
    protected Player color;

    public ChessFigure(String name, Position position, Player color) {
        this.name = name;
        this.position = position;
        this.color = color;
    }

    public ChessFigure(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public abstract  Set<Position> getAvaibleMoves(){
    }
}
