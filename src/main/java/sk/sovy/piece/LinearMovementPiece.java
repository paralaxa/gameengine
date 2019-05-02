package sk.sovy.piece;

import sk.sovy.coordinate.LinearCoordinate;

import java.util.Set;

/**
 * Created by martin.cuchran on 4/24/2019.
 */
public class LinearMovementPiece extends Piece<LinearCoordinate> {
    public LinearMovementPiece(Set<Movement<LinearCoordinate>> movements) {
        super(movements);
    }
}
