package sk.sovy.piece;

import sk.sovy.coordinate.Coordinate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by martin.cuchran on 4/24/2019.
 */
public abstract class Piece<T extends Coordinate> {
    private Set<Movement<T>> movements = new HashSet<>();
    private Long playerId;

    public Piece(Set<Movement<T>> movements) {
        this.movements = movements;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    boolean isValidMovement(T from, T to) {
        for (Movement<T> movement : movements) {
            if (!movement.canMove(from, to)) {
                return false;
            }
        }
        return true;
    }
}
