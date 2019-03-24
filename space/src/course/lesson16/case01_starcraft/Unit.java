package course.lesson16.case01_starcraft;

public class Unit {
    protected String name;
    protected Point location;

    public Unit() {
        location = new Point(0, 0);
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }


    private boolean selected;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        System.out.println(name + (selected ? "被选中" : "被取消选中"));
        this.selected = selected;
    }
}
