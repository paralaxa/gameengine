package sk.sovy.piece;

import sk.sovy.coordinate.LinearCoordinate;

/**
 * Created by martin.cuchran on 4/24/2019.
 */
public class LinearMovement implements Movement<LinearCoordinate> {
    public boolean canMove(LinearCoordinate from, LinearCoordinate to) {
        return false;
    }
}
