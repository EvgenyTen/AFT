package homework7.task3.figures;

import homework7.task3.chess.Chess;
import homework7.task3.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class King extends ChessFigure {

    public King(Position position) {
        super("Король", position);
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
        if (dx == 0 && dy == 1) return true;
        if (dx == 1 && dy == 0) return true;
        if (dx == 1 && dy == 1) return true;
        return false;
    }
}
