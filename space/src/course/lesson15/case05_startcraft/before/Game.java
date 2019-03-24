package course.lesson15.case05_startcraft.before;

import java.util.LinkedList;

public class Game {
    public static void main(String[] args) {
        new Game().run();
    }

    public void run() {
        Observer observer = new Observer();
        Stalker stalker = new Stalker();

        // 目标 让 o 和 s 都移动

        observer.fly();
        stalker.walk();

        //  方案 放到集合中
        //  泛型是什么？
        LinkedList<Object> objects = new LinkedList<Object>();
        objects.add(observer);
        objects.add(stalker);

        move(objects);
    }

    public void move(LinkedList<Object> objects) {
        //  好处：可以循环

        for (Object object : objects) {
            // 问题：尴尬
            if (object instanceof Observer) {
                //  a instanceof B
                //  a 这个对象变量，所指的对象 的类型，到底 是不是 B 类型/其子类
                Observer obs = (Observer)object;
                obs.fly();
//                ((Observer)object).fly();
            } else if (object instanceof Stalker) {
                //  a instanceof B
                //  a 这个对象变量，所指的对象 的类型，到底 是不是 B 类型/其子类
                Stalker sta = (Stalker)object;
                sta.walk();
//                ((Observer)object).fly();
            }
        }
    }
}
