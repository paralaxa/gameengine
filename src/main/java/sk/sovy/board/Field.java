package sk.sovy.board;

import sk.sovy.coordinate.Coordinate;
import sk.sovy.piece.Piece;

/**
 * Created by martin.cuchran on 4/25/2019.
 */
public abstract class Field<T extends Coordinate> {
    private T coordinate;
    private Piece<T> piece;

    public Field(T coordinate) {
        this.coordinate = coordinate;
    }

    public T getCoordinate() {
        return coordinate;
    }

    public void removePiece() {
        this.piece = null;
    }

    public void setPiece(Piece<T> piece) {
        this.piece = piece;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Field)) return false;

        Field<?> field = (Field<?>) o;

        return coordinate != null ? coordinate.equals(field.coordinate) : field.coordinate == null;
    }

    @Override
    public int hashCode() {
        return coordinate != null ? coordinate.hashCode() : 0;
    }
}
