package course.lesson14.case02_object;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run(){
        Point point = new Point(3, 4);
        System.out.println(point.toString());
    }
}
