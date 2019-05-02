package sk.sovy.board;

import sk.sovy.coordinate.Coordinate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by martin.cuchran on 4/24/2019.
 */
public abstract class Board<T extends Coordinate> {
    private Set<Field<T>> fields = new HashSet<>();

    private Map<Long, Field<T>> playerOnField = new HashMap<>();

    public Set<Field<T>> getFields() {
        return fields;
    }

    public void setFields(Set<Field<T>> fields) {
        this.fields = fields;
    }

    public Board<T> withField(Field<T> field) {
        fields.add(field);
        return this;
    }

    public void setPlayerOnField(Map<Long, Field<T>> playerOnField) {
        this.playerOnField = playerOnField;
    }
}
