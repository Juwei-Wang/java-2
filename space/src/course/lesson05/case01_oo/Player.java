package course.lesson05.case01_oo;


public class Player {
    private int atk;
    private int def;
    private int hp;
    private Weapon weapon;

    public int totalAtk() {
        //  属性
        //  +   atk: int
        //  +   def: int
        //  +   hp: int
        //  +   weapon: Weapon
        //      +   atk: int
        //      +   def: int
        //  参数变量
        //      无
        //  局部变量
        //      无
        int atk = this.atk;
        if(weapon != null) {
            atk += weapon.getAtk();
        }
        return atk;
    }

    public int totalDef() {
        return 0;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
