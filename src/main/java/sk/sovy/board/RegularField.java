package sk.sovy.board;

import sk.sovy.coordinate.Coordinate;

/**
 * Created by martin.cuchran on 4/25/2019.
 */
public class RegularField<T extends Coordinate> extends Field<T> {
    public RegularField(T coordinate) {
        super(coordinate);
    }
}
