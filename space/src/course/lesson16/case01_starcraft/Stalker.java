package course.lesson16.case01_starcraft;

public class Stalker extends Unit implements Moving{
    public Stalker() {
        name = "Stalker";
    }

    public void move(Point target){
        System.out.println(name + " 正在从 " + location + " 走到 " + target);
        location = target;
    }

    public void attack(Unit target) {
        System.out.println(name + " 正在攻击 " + target.name);
    }

}
