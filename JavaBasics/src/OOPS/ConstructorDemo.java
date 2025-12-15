package OOPS;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s = new Student("Ishan");
        System.out.println(s.name);
    }
}

