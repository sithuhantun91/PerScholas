package com.perscholas.java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArrayPATask {
}

/*
 * ● Task 1: Write a program that creates an array of integers with a length of 3. Assign
 * the values 1, 2, and 3 to the indexes. Print out each array element.
 */
class JavaArrayTask {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

/*
 * ● Task 2: Write a program that returns the middle element in an array. Give the following
 * values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
 */
class JavaArrayTask2 {
    public static void main(String[] args) {
        int[] arr = {13, 5, 7, 68, 2};
        System.out.println(arr[2]);
    }
}

/*
 * ● Task 3: Write a program that creates an array of String type and initializes it with the
 * strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy
 * using the clone( ) method. Use the Arrays.toString( ) method on the new array to
 * verify that the original array was copied.
 */
class JavaArrayTask3 {
    public static void main(String[] args) {
        String[] arr = {"red", "green", "blue", "yellow"};
        System.out.println(arr.length);
        String[] arr2 = arr.clone();
        System.out.println(Arrays.toString(arr2));
    }
}

/*
 * ● Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
 * The numbers can be any integers. Print out the value at the first index and the last
 * index using length - 1 as the index. Now try printing the value at index = length (e.g.,
 * myArray[myArray.length] ). Notice the type of exception which is produced. Now try
 * to assign a value to the array index 5. You should get the same type of exception.
 */
class JavaArrayTask4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[arr.length]);
        System.out.println(arr[5]);
    }
}

/* ● Task 5: Write a program where you create an integer array with a length of 5. Loop
 * through the array and assign the value of the loop control variable (e.g., i) to the
 * corresponding index in the array.
 */
class JavaArrayTask5 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }
}

/*
 * ● Task 6: Write a program where you create an integer array of 5 numbers. Loop
 * through the array and assign the value of the loop control variable multiplied by 2 to
 * the corresponding index in the array.
 */
class JavaArrayTask6 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
            System.out.println(arr[i]);
        }
    }
}

/*
 * ● Task 7: Write a program where you create an array of 5 elements. Loop through the
 * array and print the value of each element, except for the middle (index 2) element.
 */
class JavaArrayTask7 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            if (i != 2)
                System.out.println(arr[i]);
        }
    }
}

/*
 * ● Task 8: Write a program that creates a String array of 5 elements and swaps the first
 * element with the middle element without creating a new array.
 */
class JavaArrayTask8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}

/*
 * ● Task 9: Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
 *  Print the array in ascending order, and print the smallest and the largest
 * element of the array. The output will look like the following:
 * Array in ascending order: 0, 1, 2, 4, 9, 13
 * The smallest number is 0
 * The biggest number is 13
 */
class JavaArrayTask9 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 13, 1, 0};
        //Arrays.sort(arr);
        int minIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Array in ascending order: " + Arrays.toString(arr));
        System.out.println("The smallest number is " + arr[0]);
        System.out.println("The biggest number is " + arr[arr.length - 1]);
    }
}

/*
 * ● Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the
 * array.
 */
class JavaArrayTask10 {
    public static void main(String[] args) {
        Object[] arr = {1, "red", "green", "blue", 3.5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //or
        System.out.println(Arrays.toString(arr));
    }
}

/*
 * ● Task 11: Write some Java code that asks the user how many favorite things they
 * have. Based on their answer, you should create a String array of the correct size.
 * Then ask the user to enter the things and store them in the array you created. Finally,
 * print out the contents of the array.
 */
class JavaArrayTask11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("What are these?");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}