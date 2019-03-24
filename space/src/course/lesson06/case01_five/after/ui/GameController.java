package course.lesson06.case01_five.after.ui;

import course.lesson06.case01_five.after.core.Game;
import course.lesson06.case01_five.after.core.Player;
import io.zzax.jadeite.console.Console;

public class GameController {
    private Game game = new Game();

    public void run() {
        inputPlayerNames();

        while (true) {
            BoardView boardView = new BoardView(game.getBoard());
            boardView.display();

            Player currentPlayer = game.getCurrentPlayer();
            Console.println(currentPlayer.getName());
            game.turn();
            Console.readInt();
        }
    }

    private void inputPlayerNames() {
        // 获取玩家信息
        Console.println("输入黑棋昵称");
        String nameBlack = Console.nextLine();
        Player blackPlayer = game.getBlackPlayer();
        blackPlayer.setName(nameBlack);

        Console.println("输入白昵称");
        String nameWhite = Console.nextLine();
        Player whitePlayer = game.getWhitePlayer();
        whitePlayer.setName(nameWhite);
    }
}
