package course.lesson04.case03_composition;

public class Player {
    private int atk;
    private int def;
    private Weapon weapon; // null
    // 有
    // 能找到

    public int totalAtk() {
        int atk = this.atk;
//        if(weapon != null) {
        atk += weapon.getAtk();
//        atk += null.getAtk();
//        }
        return atk;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
