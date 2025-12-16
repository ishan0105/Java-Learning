package PackageOne;

public class StringDemo {
    public static void main(String[] args) {
        String str = new String("Ishan");
        System.out.println(str);

        // ways of creating string
        // 1. String literal: String str = "Ishan";
        // 2. Using new keyword: String str = new String("Ishan");

        // CharSequence Interface
        // It is used for representing the sequence of characters in Java.
        // Classes that are implemented using the CharSequence interface are: String, StringBuilder, StringBuffer and StringTokenizer.

        // Immutable Strings: String objects are immutable in Java.
        str.concat(" Bhatt");
        System.out.println(str);
        // A new object is created with "Ishan Bhatt", but 'str' reference variable still refers to "Ishan" and not to "Ishan Bhatt"
        // We need to explicitly assign to the reference variable.
        str = str.concat(" Bhatt");
        System.out.println(str);

        // How strings are stored in memory of Java?
        // When a String object is created as a literal, the object will be created in the 'String constant pool'.
        // This allows JVM to optimize the initialization of String literal.
        // The string constant pool is present in the heap.
        // More about string storage and heap in: https://www.geeksforgeeks.org/java/strings-in-java/
    }
}
