package course.lesson15.case02_car;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car();
        car.setWheel1(new SteelWheel());
        car.setWheel2(new SteelWheel());
        car.setWheel3(new WaterWheel());
        car.setWheel4(new WaterWheel());
        car.run();

    }
}
