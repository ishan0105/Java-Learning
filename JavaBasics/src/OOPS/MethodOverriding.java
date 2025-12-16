package OOPS;

class Animal1 {
    void move(){
        System.out.println("Animal is moving");
    }

    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog1 extends Animal1 {
    @Override void move(){
        super.move();
        System.out.println("Dog is moving");
    }

    void bark(){
        System.out.println("Dog is barking");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.move();
        d.eat();
        d.bark();
    }
}
