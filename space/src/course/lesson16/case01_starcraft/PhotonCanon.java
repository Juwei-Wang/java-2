package course.lesson16.case01_starcraft;

public class PhotonCanon extends Unit {
    public PhotonCanon() {
        name = "PhotonCanon";
    }

    public void attack(Unit target) {
        System.out.println(name + " 正在使用光子能量攻击 " + target.name);
    }
}
