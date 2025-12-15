package OOPS;

abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.fuelType();
    }
}

