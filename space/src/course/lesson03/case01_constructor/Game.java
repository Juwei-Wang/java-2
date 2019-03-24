package course.lesson03.case01_constructor;

public class Game {
    public static void main(String[] args) {
        new Game().run();
    }

    public void run() {
        int a = 3; // 字面量 literal
        Player player1 = new Player();
        // Player player1 = new Player();
        // Player player1 = Player;


        Player player2 = new Player();

        player1.setAtk(100);

    }
}
