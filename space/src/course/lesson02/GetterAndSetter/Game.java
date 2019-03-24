package course.lesson02.GetterAndSetter;

public class Game {
    public static void main(String[] args) {
        new Game().run();
    }

    public void run(){
        Player player1 = new Player();
        Player player2 = new Player();

        player1.atk = 100;
        player1.def = 100;
        player1.hp  = 100;
        player2.atk = 100;
        player2.def = 100;
        player2.hp  = 100;

        int damage = 200;
        player1.hp -= damage;
        player2.hp -= damage;
    }
}
