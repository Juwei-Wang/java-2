package course.lesson02.case03_getterAndSetter;

public class Game {
    public static void main(String[] args) {
        new Game().run();
    }

    public void run() {
        Player player1 = new Player();
        Player player2 = new Player();

//        int atk1 = 100;
        player1.setAtk(100);
        System.out.println(player2.getAtk());

        //把 .atk 换成 setter 的格式

        player1.setAtk(300);
        player1.setDef(100);
        player1.setHp(100);
        player2.setAtk(100);
        player2.setDef(100);
        player2.setHp(100);

        int damage = 200;

        player1.setAtk(player1.getAtk() - damage);
        System.out.println(player1.getAtk());

        player2.setHp(player2.getHp() - damage);

    }
}