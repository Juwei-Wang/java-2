package course.lesson05.case01_oo;

public class Driver {
    public static void main(String[] args) {
        new Driver().run();
    }

    public void run() {
        {
            Player player = new Player();
            player.setAtk(20);
            Weapon weapon = new Weapon();
            weapon.setAtk(2);
            player.setWeapon(weapon);

            int result = player.totalAtk();

            System.out.println(result);
        }
        {

            Player player = new Player();
            player.setAtk(20);

            int result = player.totalAtk();

            System.out.println(result);
        }
    }
}
