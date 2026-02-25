// Java Program demonstrating basic concepts

import java.util.Scanner;   // Used for taking user input

public class UC5_Banner {

    public static void main(String[] args) {

        // -------------------------------
        // 1. Java Comments
        // -------------------------------
        // This is a single-line comment

        /*
           This is a multi-line comment
           explaining Java basics
        */

        // -------------------------------
        // 2. Java Basic Data Types
        // -------------------------------
        int age = 16;           // integer
        float height = 5.7f;    // float
        double weight = 55.5;   // double
        char grade = 'A';       // character
        boolean isStudent = true; // boolean

        // -------------------------------
        // 3. Java Variables
        // -------------------------------
        String name = "Alex";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);

        // -------------------------------
        // 7. Taking User Input in Programs
        // -------------------------------
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // -------------------------------
        // 4. Arithmetic Operators
        // -------------------------------
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Modulus: " + remainder);

        // -------------------------------
        // 5. Operator Precedence
        // -------------------------------
        int result1 = 10 + 5 * 2;      // * happens before +
        int result2 = (10 + 5) * 2;    // parentheses first

        System.out.println("\nOperator Precedence:");
        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);

        // -------------------------------
        // 6. Type Conversion
        // -------------------------------

        // Implicit Casting (Widening)
        int intValue = 20;
        double doubleValue = intValue; // automatic conversion

        // Explicit Casting (Narrowing)
        double price = 99.99;
        int newPrice = (int) price; // manual conversion

        System.out.println("\nType Conversion:");
        System.out.println("Implicit (int to double): " + doubleValue);
        System.out.println("Explicit (double to int): " + newPrice);

        sc.close();
    }
}