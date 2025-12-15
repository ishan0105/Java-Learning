package PackageOne;

// File: Methods.java

class Parent {

    // 1️⃣ Instance Method
    void instanceMethod() {
        System.out.println("Parent: Instance method");
    }

    // 2️⃣ Static Method
    static void staticMethod() {
        System.out.println("Parent: Static method");
    }

    // 3️⃣ Final Method
    final void finalMethod() {
        System.out.println("Parent: Final method");
    }

    // 4️⃣ Protected Method
    protected void protectedMethod() {
        System.out.println("Parent: Protected method");
    }
}

// Child class to demonstrate inheritance and method calling
class Child extends Parent {

    // Method Overriding (Runtime Polymorphism)
    @Override
    void instanceMethod() {
        System.out.println("Child: Overridden instance method");
    }

    // Child-specific method
    void childMethod() {
        System.out.println("Child: Child-specific method");
    }
}

public class Methods {

    public static void main(String[] args) {
        System.out.println("Main method started");

        Methods demo = new Methods();
        demo.methodA();   // Method Call Stack starts here

        System.out.println("Main method ended");
    }

    // Instance Method
    void methodA() {
        System.out.println("Inside methodA()");
        methodB();  // calling another instance method
    }

    // Instance Method
    void methodB() {
        System.out.println("Inside methodB()");
        methodC();  // calling static method
    }

    // Static Method
    static void methodC() {
        System.out.println("Inside static methodC()");
        callDifferentMethods();
    }

    // Demonstrates calling different types of methods
    static void callDifferentMethods() {
        System.out.println("Calling different types of methods");

        // Creating object
        Child obj = new Child();

        // Calling Instance Method (Runtime Polymorphism)
        obj.instanceMethod();

        // Calling Parent Static Method
        Parent.staticMethod();

        // Calling Final Method
        obj.finalMethod();

        // Calling Protected Method
        obj.protectedMethod();

        // Calling Child-specific method
        obj.childMethod();
    }
}
