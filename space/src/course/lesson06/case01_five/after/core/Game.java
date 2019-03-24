package course.lesson06.case01_five.after.core;

public class Game {
    private Board board = new Board();
    private Player[] players = new Player[2];
    private int currentPlayerIndex;

    public Game() {
        initPlayers();
    }

    private void initPlayers() {
        players[0] = new Player();
        Token blackToken = new Token('x');
        players[0].setToken(blackToken);

        players[1] = new Player();
        Token whiteToken = new Token('o');
        players[1].setToken(whiteToken);
    }

    public Player getBlackPlayer() {
        return players[0];
    }

    public Player getWhitePlayer() {
        return players[1];
    }

    public void turn() {
        currentPlayerIndex += 1;
        currentPlayerIndex %= 2;
    }

    public Player getCurrentPlayer() {
        return players[currentPlayerIndex];
    }

    public Board getBoard() {
        return board;
    }
}
