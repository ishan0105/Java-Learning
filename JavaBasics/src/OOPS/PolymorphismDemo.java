package OOPS;

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape shape = new Circle(); // upcasting
        shape.draw(); // runtime polymorphism
    }
}

