package course.lesson03.case03_mix;

public class Player {
    private int atk;
    private int def;
    private int hp;
    private int balance;

    public Player() {
        this(100, 100, 100);
    }

    public Player(int atk, int def, int hp) {
        this.atk = atk;
        this.def = def;
        this.hp = hp;
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
