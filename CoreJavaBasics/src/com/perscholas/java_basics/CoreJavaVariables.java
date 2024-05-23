package com.perscholas.java_basics;

public class CoreJavaVariables {
    public static void main(String[] args) {
        //Addition of two integer variables
        int intValue1 = 10;
        int intValue2 = 20;
        int sum1 = intValue1 + intValue2;
        System.out.println(String.format("Sum of (%d + %d) : %d", intValue1, intValue2, sum1));

        // Addition of two double variables
        double doubleValue1 = 3.14;
        double doubleValue2 = 2.34;
        double sum2 = doubleValue1 + doubleValue2;
        System.out.println(String.format("Sum of (%,.2f + %,.2f) : %,.2f", doubleValue1, doubleValue2, sum2));

        // Addition of integer and double variables
        int intValue3 = 5;
        double doubleValue3 = 4.23;
        double sum3 = intValue3 + doubleValue3;
        System.out.println(String.format("Sum of (%d + %,.2f) : %,.2f", intValue3, doubleValue3, sum3));

        // Division of two integer variables
        int intValue4 = 25;
        int intValue5 = 10;
        int result = intValue4 / intValue5;
        double result2 = (double)intValue4 / intValue5;
        System.out.println(String.format("Division of (%d / %d) with int result : %d", intValue4, intValue5, result));
        System.out.println(String.format("Division of (%,.1f / %d) with double result : %,.1f", (double)intValue4, intValue5, result2));

        // Division of two double variables
        double doubleValue4 = 3.35;
        double doubleValue5 = 1.30;
        double result3 = doubleValue1 + doubleValue2;
        System.out.println(String.format("Division of (%,.2f / %,.2f) : %,.2f", doubleValue4, doubleValue5, result3));
        System.out.println(String.format("Division of (%,.2f / %,.2f) with casting int : %d", doubleValue4, doubleValue5, (int)result3));

        // Division of two integer variables
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println(String.format("Division of (%d / %d) : %d", y, x, q));
        //q = (double)y / x;
        System.out.println(String.format("Division of (%,.1f / %d) : %,.1f", (double)y, x, (double)q));

        // Finding area of circle
        final double PI = 3.142;
        double radius = 10;
        double area = PI * Math.pow(radius, 2);
        System.out.println(String.format("Area of Circle with radius(%,.3f) : %,.3f", radius, area));

        // Ordering at a cafe
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

    private static class Product{
        String name;
        double price;
        double subTotal;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
            this.subTotal = 0.0;
        }

        public void order(int quantity){
            subTotal += (quantity * price);
        }
    }

}
