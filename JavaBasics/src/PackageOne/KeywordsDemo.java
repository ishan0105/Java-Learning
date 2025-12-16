package PackageOne;

// abstract keyword: Used to declare an abstract class.
// An abstract class can provide implementation of the interface. It can have abstract and non-abstract methods.
abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Vehicle uses fuel");
    }
}

// interface keyword: Used to declare an interface. It can have only abstract methods.
interface Service {
    void serve();
}

// extends keyword: Used to indicate that a class is derived from another class or interface.
// implements keyword: Used to implement an interface.
class Car extends Vehicle implements Service {

    // static keyword: Used to indicate that a variable or method is a class method.
    // static keyword is mainly used for memory management in Java.
    static int wheels = 4;

    // final keyword: Used to indicate that a variable holds a constant value.
    // It is used with a variable.
    // It is used to restrict the user from updating the value of the variable.
    final int maxSpeed = 180;

    // ---------- OVERRIDE ----------
    @Override
    void start() {
        System.out.println("Car starts with key");
    }

    @Override
    public void serve() {
        System.out.println("Car service done");
    }

    // this keyword: Used to refer the current object in a method or constructor.
    void showDetails() {
        System.out.println("Max speed: " + this.maxSpeed);
    }

    // ---------- STATIC METHOD ----------
    static void showWheels() {
        System.out.println("Car has " + wheels + " wheels");
    }
}

public class KeywordsDemo {

    // ---------- FINAL + STATIC ----------
    static final String COMPANY = "Java Motors";

    public static void main(String[] args) {

        // new keyword: Used to create new objects
        Car car = new Car();

        // instanceof keyword: Used to test whether the object is an instance of the specified class or implements an interface.
        if (car instanceof Vehicle) {
            System.out.println("Car is a Vehicle");
        }

        // ---------- METHOD CALLS ----------
        car.start();
        car.fuel();
        car.serve();
        car.showDetails();

        Car.showWheels();

        // ---------- CONTROL FLOW KEYWORDS ----------
        for (int i = 1; i <= 5; i++) {

            // continue keyword: Used to continue the loop.
            // It continues the current flow of the program and skips the remaining code at the specified condition.
            if (i == 3) {
                continue;
            }

            // break keyword: Used to break the loop or switch statement.
            // It breaks the current flow of the program at specified conditions.
            if (i == 5) {
                break;
            }

            System.out.println("i = " + i);
        }

        // return keyword: Used to return from a method when its execution is complete.
        System.out.println("End of main");
        return;
    }
}
