package course.lesson01.case01_object;

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

        player2.atk = 200;
        player2.def = 100;
        player2.hp  = 100;

//        player1.trace();
//        player2.trace();

        System.out.println(player1.description());
    }
}


