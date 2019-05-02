package sk.sovy.piece;

import sk.sovy.coordinate.Coordinate;

/**
 * Created by martin.cuchran on 4/24/2019.
 */
public interface Movement<T extends Coordinate> {
    boolean canMove(T from, T to);
}
