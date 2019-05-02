package sk.sovy.game;

import sk.sovy.board.Board;
import sk.sovy.board.FieldGenerator;
import sk.sovy.coordinate.Coordinate;
import sk.sovy.player.Player;

import java.util.Set;

/**
 * Created by martin.cuchran on 4/25/2019.
 */
public class Game<T extends Coordinate> {
    private Board<T> board;
    private Set<Player> players;
    private GameState gameState = GameState.CREATING;

    public Game(Board<T> board, Set<Player> players) {
        this.board = board;
        this.players = players;
    }

    public Board<T> getBoard() {
        return board;
    }

    public void init(FieldGenerator<T> fieldGenerator) {
        this.board.setFields(fieldGenerator.generateFields());
        this.gameState = GameState.STARTED;
    }
}


