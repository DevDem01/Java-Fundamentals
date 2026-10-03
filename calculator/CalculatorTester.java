package calculator;

import java.util.*;

public class CalculatorTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        ScientificCalculator sc = new ScientificCalculator(a, b);

        System.out.println("Results:");
        System.out.println("Addition: " + sc.add());
        System.out.println("Multiplication: " + sc.multiply());
        System.out.println("Square root : " + sc.squareRoot());
        System.out.println("Exponent : " + sc.exponent());

        input.close();
    }
}
