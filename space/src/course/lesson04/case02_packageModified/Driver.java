package course.lesson04.case02_packageModified;

import course.lesson04.case02_packageModified.p.Rect;

//import java.lang.*;

public class Driver {
    public static void main(String[] args) {
//        course.lesson04.case02_packageModified.Point p = new course.lesson04.case02_packageModified.Point();

        // 使用类的时候 可以不写 包路径前缀
        // 系统会从你当前包下找类

        new Point();
//        new p.Rect();

        Rect rect = new Rect();
    }
}
