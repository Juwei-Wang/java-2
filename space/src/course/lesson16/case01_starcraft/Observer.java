package course.lesson16.case01_starcraft;

public class Observer extends Unit implements Moving {
    public Observer() {
        name = "Observer";
    }

    public void move(Point target){
        System.out.println(name + " 正在从 " + location + " 飞到 " + target);
        location = target;
    }

}
