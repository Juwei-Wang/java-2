package course.lesson16.case01_starcraft;

import java.util.LinkedList;

public class GameMap {
    private LinkedList<Unit> units = new LinkedList<>();

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public void selectInArea(Rectangle rect) {
        for (Unit unit : units) {
            if (rect.hitTest(unit.location)) {
                unit.setSelected(true);
            } else {
                unit.setSelected(false);
            }
        }
    }

    public void selectedUnitsMove(Point target) {
        for (Unit unit : units) {
            if (unit.isSelected()) {
//                if (unit instanceof Stalker) {
//                    ((Stalker)unit).move(target);
//                } else if (unit instanceof Observer) {
//                    ((Observer)unit).move(target);
//                }

                if (unit instanceof Moving) {
                    Moving moving = (Moving) unit;
                    moving.move(target);
                }
            }
        }
    }

    public void selectedUnitsAttack(Unit target) {
        for (Unit unit : units) {
            if (unit.isSelected()) {
                if (unit instanceof Stalker) {
                    ((Stalker) unit).attack(target);

                } else if (unit instanceof PhotonCanon) {
                    ((PhotonCanon) unit).attack(target);

                }
            }
        }
    }
}