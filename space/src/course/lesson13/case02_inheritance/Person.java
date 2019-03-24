package course.lesson13.case02_inheritance;

public class Person extends Animal {
//    public int age;
    public double balance;
    public void eat() {
        System.out.println("Person eat()");
        super.eat();
    }
    public void work() {
        System.out.println("Person work()");
    }
}