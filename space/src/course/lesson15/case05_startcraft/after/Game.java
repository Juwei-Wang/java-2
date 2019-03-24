package course.lesson15.case05_startcraft.after;

import java.util.LinkedList;

public class Game {
    public static void main(String[] args) {
        Observer observer = new Observer();
        Stalker stalker = new Stalker();

        LinkedList<Unit> units = new LinkedList<>();
        units.add(observer);
        units.add(stalker);

        for (Unit unit : units) {
            unit.move();
        }

    }
}
