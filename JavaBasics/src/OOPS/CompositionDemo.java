package OOPS;

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Cars {
    private Engine eng = new Engine();

    void drive() {
        eng.start();
        System.out.println("Car is moving");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.drive();
    }
}

