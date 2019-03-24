package course.lesson06.case01_five.after.ui;

import course.lesson06.case01_five.after.core.Board;
import course.lesson06.case01_five.after.core.Point;
import course.lesson06.case01_five.after.core.Token;
import io.zzax.jadeite.console.Console;

public class BoardView {
    private Board board;

    public BoardView(Board board) {
        this.board = board;
    }

    // step 2
    //
    public void display() {
        //  +   打印左上角
        Console.print(String.format("%-3s", ""));
        //  +   打印列名
        for (int i = 0; i < board.getSize(); i++) {
            int columnNumber = i + 1;
            Console.print(String.format("%-3d", columnNumber));
        }
        Console.println();

        //  +   打印所有行
        for (int y = 0; y < board.getSize(); y++) {
            //  打印这一行
            //  +   打印行名
            //  y   0   1   2
            //  c   A   B   C -> c = y + 'A'
            char rowName = (char)('A' + y);
            Console.print(String.format("%-3s", rowName));

            //  +   打印棋子
            for (int x = 0; x < board.getSize(); x++) {
                Token token = board.get(new Point(x, y));
                char icon = token == null ? '.' : token.getIcon();
                Console.print(String.format("%-3s", icon));
            }

            Console.println();
        }
    }
}
