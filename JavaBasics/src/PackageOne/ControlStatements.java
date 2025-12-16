package PackageOne;

public class ControlStatements {

    public static void main(String[] args) {

        int number = 10;

        // If statement
        if (number > 0) {
            System.out.println("Number is positive");
        }

        // If - Else Statement
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // If - Else If ladder
        if (number < 0) {
            System.out.println("Negative number");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive number");
        }

        // Switch Statement
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // For Loop
        System.out.println("For loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        // While Loop
        System.out.println("While loop:");
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }

        // Do-While Loop
        System.out.println("Do-while loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 3);

        // Break Statement
        System.out.println("Break example:");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                break;
            }
            System.out.println(k);
        }

        // Continue Statement
        System.out.println("Continue example:");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                continue;
            }
            System.out.println(k);
        }

        // Return Statement
        System.out.println("Before return");
        return; // exits main method
    }
}

