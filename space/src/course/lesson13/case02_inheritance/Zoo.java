package course.lesson13.case02_inheritance;

public class Zoo {
    public static void main(String[] args) {
        new Zoo().run();
    }

    public void run() {
//        Dog dog = new Dog();
//        Person person = new Person();
//        dog.eat();
//        person.eat();

        Animal animal = new Person();
        animal.eat();
        ((Person) animal).work();
//        animal.work();
//        ((Person) animal).work();

    }
}