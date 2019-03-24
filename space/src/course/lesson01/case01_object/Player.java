package course.lesson01.case01_object;


public class Player {
    public int atk;
    public int def;
    public int hp;

    public void trace() {
        System.out.println(description());
    }

    public String description() {
        return "atk: " + atk + ", def: " + def;
    }

}
