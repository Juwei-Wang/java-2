package course.lesson16.case01_starcraft;

public class Game {
    public static void main(String[] args) {
        new Game().run();
    }

    public void run() {
        GameMap map = new GameMap();

        Stalker stalker = new Stalker();
        stalker.setLocation(new Point(1, 1));
        map.addUnit(stalker);

        Observer observer = new Observer();
        observer.setLocation(new Point(2, 2));
        map.addUnit(observer);

        PhotonCanon photonCanon = new PhotonCanon();
        photonCanon.setLocation(new Point(3, 3));
        map.addUnit(photonCanon);

        map.selectInArea(new Rectangle(new Point(0, 0), 4, 4));
        map.selectedUnitsMove(new Point(6, 6));
        map.selectedUnitsAttack(stalker);

    }
}