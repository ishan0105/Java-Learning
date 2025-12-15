package OOPS;

class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class ClassAndObjectDemo {
    public static void main(String[] args) {
        Car car = new Car();   // object creation
        car.brand = "Tesla";
        car.speed = 100;
        car.drive();
    }
}
