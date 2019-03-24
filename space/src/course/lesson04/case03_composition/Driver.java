package course.lesson04.case03_composition;

public class Driver {
    public static void main(String[] args) {
        new Driver().run();
    }

    public void run() {
        // 戒指环 宝石
        // 托 宝石
        // 对象变量 对象

        Player playerEmpty = null;
        playerEmpty.getAtk();


        Player player = new Player();
        player.setAtk(10);
        // 计算机创建了 几个对象

        System.out.println(player.getWeapon());

        Weapon weapon = new Weapon();
        weapon.setAtk(2);


        player.setWeapon(weapon); //!!!!!!!!!!


        int atk = player.totalAtk();
        System.out.println(atk);

        // player atk 10
        // weapon atk 2
        // print totalAtk 12


    }
}




