package sk.sovy.board;

import sk.sovy.coordinate.Coordinate;

import java.util.Set;

/**
 * Created by martin.cuchran on 4/25/2019.
 */
public interface FieldGenerator<T extends Coordinate> {
    Set<Field<T>> generateFields();
}
