public class Demo {
    public static void main(String[] args) {
        Engine engine = new Engine(600, 6000, 10);
        Car car = new Car(2020, "X6", "BMW", engine);
        System.out.println(car.getEngine().getHorsePower());
        engine.setHorsePower(12);
        System.out.println(car.getEngine().getHorsePower());
    }
}
