package com.perscholas.java_basics;

import java.util.Scanner;

public class Loops {
}

/**
 * 1: Print a Multiplication Table
 * Write a program that uses nested for loops to print a multiplication table(No.1~12).
 */
class Loops1 {
    public static void main(String[] args) {
        for (int x = 1; x <= 12; x++) {
            for (int y = 1; y <= 12; y++) {
                System.out.print(String.format("%5s", x * y));
            }
            System.out.println();
        }
    }
}

/*
 * 2: Find the Greatest Common Divisor
 * ❖ Write a program that prompts the user to enter two positive
 * integers, and find their greatest common divisor (GCD).
 * ❖ Examples:
 *  ➢ Enter 2 and 4. The gcd is 2.
 *  ➢ Enter 16 and 24. The gcd is 8.
 * ❖ How do you find the gcd?
 *  ➢ Name the two input integers n1 and n2.
 *  ➢ You know number 1 is a common divisor, but it may not be
 *    the gcd.
 *  ➢ Check whether k (for k = 2, 3, 4, and so on) is a common
 *    divisor for n1 and n2, until k is greater than n1 or n2.
 */
class Loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two positive numbers to calculate their greatest common divisor (GCD)");
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();
        int gcd = 1;
        for (int k = 2; (k <= first) || (k <= second); k++) {
            if (first % k == 0 && second % k == 0) {
                gcd = k;
            }
        }
        System.out.println("The gcd is " + gcd);
    }
}

/*
 * 3: Predict Future Tuition
 * ❑ Suppose the tuition for a university is $10,000 for the current year
 * and increases by 7 percent every year.
 * ❑ In how many years will the tuition be doubled?
 * Year    |  Tuition
 * 0       | $10,000
 * 1       | tuition = 1.07 * tuition
 * ...     | tuition = 1.07 * tuition
 * ...     | tuition = 1.07 * tuition
 * ...     | ...
 * ?       | $20,000 or more
 */
class Loops3 {
    public static void main(String[] args) {
        int year = 0;
        int currentTuition = 10000;
        int tuition = currentTuition;
        System.out.print(String.format("%5s", "Year"));
        System.out.println("| Tuition");
        System.out.print(String.format("%5s", ++year));
        System.out.println(String.format("| $%s", tuition));
        do {
            tuition = (int) (1.07 * tuition);
            System.out.print(String.format("%5s", ++year));
            System.out.println(String.format("| $%s", tuition));
        } while (tuition < (currentTuition * 2));
        System.out.println("The tuition will be doubled in " + year + " years");
    }
}