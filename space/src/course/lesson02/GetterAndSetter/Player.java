package course.lesson02.GetterAndSetter;

public class Player {
    public int atk;
    public int def;
    public int hp;

    public void trace(){
        System.out.println("atk:" + atk + ", def:" + def);

    }
    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;

    }

    
}

