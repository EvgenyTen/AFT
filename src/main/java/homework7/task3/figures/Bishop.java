package homework7.task3.figures;

import homework7.task3.chess.Chess;
import homework7.task3.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Bishop extends ChessFigure {
    public Bishop(Position position) {
        super("Слон", position);
    }

    @Override
    public Set<Position> getAvaibleMoves() {
        Set<Position> allPositions = Chess.getAll();
        Set<Position> avaibleMoves = new HashSet<>();
        for (Position candidate : allPositions)
            if (isMoveAvailable(position, candidate))
                avaibleMoves.add(candidate);
        return avaibleMoves;
    }

    private boolean isMoveAvailable(Position figurePosition, Position candidate) {
        int dx = Math.abs(figurePosition.getHorizontal() - candidate.getHorizontal());
        int dy = Math.abs(figurePosition.getVertical() - candidate.getVertical());
        if (dx == 1 && dy == 1) return true;
        if (dx == 2 && dy == 2) return true;
        if (dx == 3 && dy == 3) return true;
        if (dx == 4 && dy == 4) return true;
        if (dx == 5 && dy == 5) return true;
        if (dx == 6 && dy == 6) return true;
        if (dx == 7 && dy == 7) return true;
        if (dx == 8 && dy == 8) return true;
        return false;
    }
}