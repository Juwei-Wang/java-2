package course.lesson03.case01_constructor;


public class Player {
    private int atk;
    private int def;
    private int hp;

    // 初始化方法
    public Player() {
        System.out.println("Init");
    }

    public void trace(){
        System.out.println("atk:" + atk + ", def:" + def);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
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
}
