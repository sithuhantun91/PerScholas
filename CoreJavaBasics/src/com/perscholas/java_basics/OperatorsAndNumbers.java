package com.perscholas.java_basics;

public class OperatorsAndNumbers {
    public static void main(String[] args) {
        /*
        * 1. Write a program that declares an integer a variable x, assigns the value 2 to it, and
        *   prints out the binary string version of the number ( Integer.toBinaryString(x) ). Now,
        *   use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing
        *   the results, write a comment with the predicted decimal value and binary string. Now,
        *   print out x in decimal form and in binary notation.
        *   Perform the preceding exercise with the following values:
        *   a. 9
        *   b. 17
        *   c. 88
        * */
        System.out.println("No.1");
        leftShift(2);
        leftShift(9);
        leftShift(17);
        leftShift(88);

        /*
        * 2. Write a program that declares a variable x, and assigns 150 to it, and prints out the
        *   binary string version of the number. Now use the right shift operator (>>) to shift by 2
        *   and assign the result to x. Write a comment indicating what you anticipate the
        *   decimal and binary values to be. Now print the value of x and the binary string.
        *   Perform the preceding exercise with the following values:
        *   a. 225
        *   1b. 1555
        *   c. 32456
        */
        System.out.println("No.2");
        rightShift(150);
        rightShift(225);
        rightShift(1555);
        rightShift(32456);

        /*
        * 3. Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
        * Write a comment that indicates what you predict will be the result of the bitwise and
        * operation on x and y. Now use the bitwise AND (&) operator to derive the decimal and
        * binary values, and assign the result to z.
         */
        System.out.println("No.3");
        int x = 7;     //00111
        int y = 17;    //10001
        int z = x & y; //00001
        System.out.println("After x(7) & y(17),");
        System.out.println(String.format("Decimal version of z : %s", z));
        System.out.println(String.format("Binary version of z : %s", Integer.toBinaryString(z)));

        /*
        * 4. Now, with the preceding values, use the bitwise and operator to calculate the “or”
        *    value between x and y. As before, write a comment that indicates what you predict
        *    the values to be before printing them out.
        * */
        System.out.println("No.4");
        z = x | y; //00111(7) | 10001(17) = 10111(23)
        System.out.println("After x(7) | y(17),");
        System.out.println(String.format("Decimal version of z : %s", z));
        System.out.println(String.format("Binary version of z : %s", Integer.toBinaryString(z)));

        /*
        * 5. Write a program that declares an integer variable, assigns a number, and uses a
        *    postfix increment operator to increase the value. Print the value before and after the
        *    increment operator.
        * */
        System.out.println("No.5");
        System.out.println("Before increment x: " + x);
        System.out.println("Processing ++x: " + ++x);
        System.out.println("After increment x: " + x);

        /*
        * 6. Write a program that demonstrates at least three ways to increment a variable by 1
        *    and does this multiple times. Assign a value to an integer variable, print it, increment
        *    by 1, print it again, increment by 1, and then print it again.
        * */
        System.out.println("No.6");
        System.out.println("x: " + x);
        System.out.println("x++: " + x++);
        System.out.println("++x: " + ++x);
        System.out.println("x + 1: " + (x+1));

        /*
        * 7. Write a program that declares two integer variables: x, and y, and then assigns 5 to x
        *     and 8 to y. Create another variable sum and assign the value of ++x added to y, and
        *     print the result. Notice the value of the sum (should be 14). Now change the
        *     increment operator to postfix (x++) and re-run the program. Notice what the value of
        *     2the sum is. The first configuration incremented x, and then calculated the sum, while
        *     the second configuration calculated the sum, and then incremented x.
        * */
        System.out.println("No.7");
        x = 5;
        y = 8;
        int sum = ++x + y;
        System.out.println("Sum: " + sum);
        x = 5;
        y = 8;
        sum = x++ + y;
        System.out.println("Sum: " + sum);
    }

    static void leftShift(int x) {
        System.out.println(String.format("Binary version of x(%d) : %s", x, Integer.toBinaryString(x)));
        x = x << 1;
        System.out.println("After x left shift(<<) by 1,");
        System.out.println(String.format("Decimal version of x : %s", x));
        System.out.println(String.format("Binary version of x : %s", Integer.toBinaryString(x)));
        System.out.println();
    }

    static void rightShift(int x) {
        System.out.println(String.format("Binary version of x(%d) : %s", x, Integer.toBinaryString(x)));
        x = x >> 2;
        System.out.println("After x right shift(>>) by 2,");
        System.out.println(String.format("Decimal version of x : %s", x));
        System.out.println(String.format("Binary version of x : %s", Integer.toBinaryString(x)));
        System.out.println();
    }
}
