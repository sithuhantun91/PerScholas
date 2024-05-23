package com.perscholas.java_basics;

public class CoreJavaVariables {
    public static void main(String[] args) {
        /*
        Write a program that declares two integer variables, assigns an integer to each, and
        adds them together. Assign the sum to a variable. Print out the result.
        */
        int intValue1 = 10;
        int intValue2 = 20;
        int sum1 = intValue1 + intValue2;
        System.out.println(String.format("Sum of (%d + %d) : %d", intValue1, intValue2, sum1));

        /*
        Write a program that declares two double variables, assigns a number to each, and
        adds them together. Assign the sum to a variable. Print out the result.
        */
        double doubleValue1 = 3.14;
        double doubleValue2 = 2.34;
        double sum2 = doubleValue1 + doubleValue2;
        System.out.println(String.format("Sum of (%,.2f + %,.2f) : %,.2f", doubleValue1, doubleValue2, sum2));

        /*
        Write a program that declares an integer variable and a double variable, assigns
        numbers to each, and adds them together. Assign the sum to a variable. Print out the
        result. What variable type must the sum be?
        */
        int intValue3 = 5;
        double doubleValue3 = 4.23;
        double sum3 = intValue3 + doubleValue3;
        System.out.println(String.format("Sum of (%d + %,.2f) : %,.2f", intValue3, doubleValue3, sum3));

        /*
        Write a program that declares two integer variables, assigns an integer to each, and
        divides the larger number by the smaller number. Assign the result to a variable. Print
        out the result. Now change the larger number to a decimal. What happens? What
        corrections are needed?
        */
        int intValue4 = 25;
        int intValue5 = 10;
        int result = intValue4 / intValue5;
        double result2 = (double) intValue4 / intValue5;
        System.out.println(String.format("Division of (%d / %d) with int result : %d", intValue4, intValue5, result));
        System.out.println(String.format("Division of (%,.1f / %d) with double result : %,.1f", (double) intValue4, intValue5, result2));

        /*
        Write a program that declares two double variables, assigns a number to each, and
        divides the larger by the smaller number. Assign the result to a variable. Print out the
        result. Now, cast the result to an integer. Print out the result again.
        */
        double doubleValue4 = 3.35;
        double doubleValue5 = 1.30;
        double result3 = doubleValue1 + doubleValue2;
        System.out.println(String.format("Division of (%,.2f / %,.2f) : %,.2f", doubleValue4, doubleValue5, result3));
        System.out.println(String.format("Division of (%,.2f / %,.2f) with casting int : %d", doubleValue4, doubleValue5, (int) result3));

        /*
        Write a program that declares two integer variables, x and y, and assigns the number 5
        to x and the number 6 to y. Declare a variable q and assign y/x to it and print q. Now,
        cast y to a double and assign it to q. Print q again.
        */
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println(String.format("Division of (%d / %d) : %d", y, x, q));
        //q = (double)y / x;
        System.out.println(String.format("Division of (%,.1f / %d) : %,.1f", (double) y, x, (double) q));

        /*
        Write a program that declares a named constant and uses it in a calculation. Print the
        result.
        */
        final double PI = 3.142;
        double radius = 10;
        double area = PI * Math.pow(radius, 2);
        System.out.println(String.format("Area of Circle with radius(%,.3f) : %,.3f", radius, area));

        /*
        Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        Assign prices to each product. Create two more variables called subtotal and totalSale
        and complete an “order” for three items of the first product, four items of the second
        product, and two items of the third product. Add them all together to calculate the
        subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to
        obtain the totalSale amount. Be sure to format the results to two decimal places.
        */
        Product product1 = new Product("Coffee", 3.89);
        Product product2 = new Product("Cappuccino", 4.46);
        Product product3 = new Product("Espresso", 5.15);
        double subTotal = 0.0;
        double totalSale = 0.0;
        final double SALES_TAX_RATE = 0.08; //8 percent
        product1.order(3);
        product2.order(4);
        product3.order(2);
        subTotal = product1.subTotal + product2.subTotal + product3.subTotal;
        totalSale = subTotal + (subTotal * SALES_TAX_RATE);
        System.out.println(String.format("Total Sale: %,.2f", totalSale));
    }

    private static class Product {
        String name;
        double price;
        double subTotal;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
            this.subTotal = 0.0;
        }

        public void order(int quantity) {
            subTotal += (quantity * price);
        }
    }

}
