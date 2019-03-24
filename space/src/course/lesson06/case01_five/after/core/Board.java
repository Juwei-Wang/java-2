package course.lesson06.case01_five.after.core;

public class Board {
    private int size = 15;
    private Token[][] tokens = new Token[size][size]; // 15 x 15 null

    /*
        Board
        限制：超过棋盘的范围就不能下棋
        限制：棋子不能下在同一个位置，有棋子的位置
        功能：需要检测输赢，连成5个算赢
        功能：在棋盘上落子
    */

    /*
     *      Point location = ....;
     *      if(board.inside(location)) {
     *          board.place(token, location);
     *      } else {
     *          Console.println("illegal position");
     *      }
     *
     */

    public boolean inside(Point location) {
        boolean hInside = location.getX() >= 0 && location.getX() < size;
        boolean vInside = location.getY() >= 0 && location.getY() < size;
        return hInside && vInside;
    }

    public boolean exist(Point location) {
        return tokens[location.getY()][location.getX()] != null;
    }

    public boolean checkWin(Point location) {
        return false;
    }

    public void place(Token token, Point location) {
        tokens[location.getY()][location.getX()] = token;
    }

    public int getSize() {
        return size;
    }

    public Token get(Point location) {
        return tokens[location.getY()][location.getX()];
    }
}
