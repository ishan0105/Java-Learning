package OOPS;

// ---------- SINGLE INHERITANCE ----------
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Dog extends Animal → Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// ---------- MULTILEVEL INHERITANCE ----------
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

// ---------- HIERARCHICAL INHERITANCE ----------
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// ---------- MULTIPLE INHERITANCE (USING INTERFACES) ----------
interface Pet {
    void friendly();
}

interface Guard {
    void guard();
}

// Class implementing multiple interfaces
class WorkingDog extends Dog implements Pet, Guard {

    @Override
    public void friendly() {
        System.out.println("WorkingDog is friendly");
    }

    @Override
    public void guard() {
        System.out.println("WorkingDog is guarding the house");
    }
}

// ---------- MAIN DEMO CLASS ----------
public class InheritanceDemo {

    public static void main(String[] args) {

        // 1️⃣ Single Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println("----------------");

        // 2️⃣ Multilevel Inheritance
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.play();

        System.out.println("----------------");

        // 3️⃣ Hierarchical Inheritance
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        System.out.println("----------------");

        // 4️⃣ Multiple Inheritance using Interfaces
        WorkingDog wd = new WorkingDog();
        wd.eat();       // from Animal
        wd.bark();      // from Dog
        wd.friendly();  // from Pet interface
        wd.guard();     // from Guard interface
    }
}

