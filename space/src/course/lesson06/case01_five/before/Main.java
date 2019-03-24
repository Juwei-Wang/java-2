package course.lesson06.case01_five.before;

import io.zzax.jadeite.console.Console;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }


    int size;
    int[][] board;

    public void run() {

        // 获取玩家信息
        Console.println("输入黑棋昵称");
        String nameBlack = Console.nextLine();
        Console.println("输入白昵称");
        String nameWhite = Console.nextLine();

        // 初始化棋盘
        size = 15;
        board = new int[size][size];
        board[3][1] = 1;
        board[2][3] = 2;


        // 0 1 2 3 4 5 6 7 8 9
        // 0 1 0 1 0 1 0 1 0 1
        int turn = 0;
        // loop until 有人赢{
        while (true) {
            //	打印棋盘
            printBoard();

            //	打印 提示玩家下棋
            String currentPlayer = turn == 0 ? nameBlack : nameWhite;

            // ------- ^ 之前
            int[] location = readLocation(currentPlayer);
            int x = location[0];
            int y = location[1];

            // ------- v 之后

            board[y][x] = turn == 0 ? 1 : 2;

            // 	检测输赢
            boolean result = check(x, y);
            if (result) {
                break;
            }


            turn += 1;
            turn %= 2;
            // 0 1 2 3
        }
        // }

        // 	打印棋盘
        // 	显示胜利玩家信息
    }


    // Extract Method
    public void printBoard() {
        //  +   打印左上角
        Console.print(String.format("%-3s", ""));
        //  +   打印列名
        for (int i = 0; i < size; i++) {
            int columnNumber = i + 1;
            Console.print(String.format("%-3d", columnNumber));
        }
        Console.println();

        //  +   打印所有行
        for (int y = 0; y < size; y++) {
            //  打印这一行
            //  +   打印行名
            //  y   0   1   2
            //  c   A   B   C -> c = y + 'A'
            char rowName = (char)('A' + y);
            Console.print(String.format("%-3s", rowName));

            //  +   打印棋子
            for (int x = 0; x < size; x++) {
                int value = board[y][x];
                char token = convertValueToToken(value);
                Console.print(String.format("%-3s", token));
            }

            Console.println();
        }
    }

    public char convertValueToToken(int value) {
        char token = '.';
        if (value == 1) {
            token = 'x';
        } else if (value == 2) {
            token = 'o';
        }
        return token;
    }

    public int[] readLocation(String player) {
        Console.println("该 " + player + " 下棋");

        int y = 0;
        int x = 0;
        while(true) {
            //	玩家下棋
            String locationInput = Console.nextLine();
            // "C4" charAt(0) -> 'C'
            // "C4" substring(1) -> "4"
            // 'C' - 'A' -> y
            // Integer.valueOf("4") - 1 -> x
            char yChar = locationInput.charAt(0);
            y = yChar - 'A';
            String xString = locationInput.substring(1);
            x = Integer.valueOf(xString) - 1;

//            if (x >= size || y >= size) {
//                Console.println("位置有误，请重新输入");
//                continue;
//            }
//            if (board[y][x] != 0) {
//                Console.println("已有棋子，请重新输入");
//                continue;
//            }
//
//            break;

            if (x < size && y < size && board[y][x] == 0) {
                break;
            } else {
                Console.println("请重新输入");
            }
//            if (board[y][x] == 0 && x < size && y < size) {
//                break;
//            }
        }

        int[] point = new int[2];
        point[0] = x;
        point[1] = y;
        return point;
    }

    public boolean check(int x, int y) {
        return countHorizontally(x, y) >= 5;
    }

    // 检查 x y 坐标这个棋子 横向 有几个 连着它的棋子 (包含 xy本身)
    public int countHorizontally(int x, int y) {
        return countLeft(x, y) + countRight(x, y) + 1;
    }

    //  计算 x y 坐标的这个棋子 左边 有几个 连着它的棋子 (不包含 xy本身)
    public int countLeft(int x, int y) {
        int originalToken = board[y][x];
        int count = 0;
        while (true) {
            x--;
            int token = get(x, y);
            if (originalToken == token) {
                count ++;
            } else {
                break;
            }
        }
        return count;
    }


    //  计算 x y 坐标的这个棋子 右边 有几个 连着它的棋子 (不包含 xy本身)
    public int countRight(int x, int y) {
        int originalToken = board[y][x];
        int count = 0;
        while (true) {
            x++;
            int token = get(x, y);
            if (originalToken == token) {
                count ++;
            } else {
                break;
            }
        }
        return count;
    }

    //
    public int get(int x, int y) {
        if (x >= 0 && x < size && y >= 0 && y < size) {
            return board[y][x];
        } else {
            return -1;
        }
    }



    public boolean check2(int x, int y) {
        return countHorizontally2(x, y) >= 5 ||
                countVertically(x, y) >= 5;
    }

    //  计算 x y 坐标的这个棋子 有几个 连着它的棋子 (不包含 xy本身)
    //  dx, dy = 1, 0
    //  dx, dy = 1, 1
    //  dx, dy = 0, 1
    //  dx, dy = -1, 1
    //  dx, dy = -1, 0
    //  dx, dy = -1, -1
    //  dx, dy = 0, -1
    //  dx, dy = 1, -1
    public int countHorizontally2(int x, int y) {
        return countOnDirection(x, y, -1, 0) + countOnDirection(x, y, 1, 0) + 1;
    }

    public int countVertically(int x, int y) {
        return countOnDirection(x, y, 0, -1) + countOnDirection(x, y, 0, 1) + 1;
    }

    // [[1, 0], [1, 1], [0, 1], [-1, 1]]
    //   -1, 0,  -1, -1, 0, -1, 1, -1

    public int countOnDirection(int x, int y, int dx, int dy) {
        int originalToken = board[y][x];
        int count = 0;
        while (true) {
            x += dx;
            y += dy;
            int token = get(x, y);
            if (originalToken == token) {
                count ++;
            } else {
                break;
            }
        }
        return count;
    }

    //


}
