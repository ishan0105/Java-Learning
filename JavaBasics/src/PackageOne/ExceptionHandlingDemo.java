package PackageOne;

public class ExceptionHandlingDemo {
    static void performDivision() throws ArithmeticException { // throws keyword is used
        try {
            System.out.println("Inner try block");
            int a = 10 / 0; // causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Inner catch: " + e);
            throw e; // rethrowing exception to caller
        }
        System.out.println("performDivision function ended");
    }

    static void checkString(String str) {
        if (str == null) {
            throw new NullPointerException("String is null"); // explicitly thrown using 'throw' keyword
        }
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            performDivision();
            checkString("Ishan");
            checkString(null);
        } catch (NullPointerException e) {
            System.out.println("Outer catch: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}
