package com.perscholas.java_basics;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        //int[] arr = {5, 3, 2, 1, 0, -1};
        int[] arr = {1, 2, 3, 5};
        System.out.println(findMissingInt(arr));
    }

    public static int findMissingInt(int[] arr) {
        int missingNum = 0;
        if (arr == null || arr.length == 1) return 0;
        if (isAscending(arr)) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] != (arr[i] + 1)) {
                    missingNum = arr[i] + 1;
                    arr = consecutiveInsert(arr, missingNum);
                    //System.out.println(Arrays.toString(arr));
                    return missingNum;
                }
            }
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] != (arr[i] - 1)) {
                    missingNum = arr[i] - 1;
                    arr = consecutiveInsert(arr, missingNum);
                    //System.out.println(Arrays.toString(arr));
                    return missingNum;
                }
            }
        }
        return 0;
    }

    public static int[] consecutiveInsert(int[] arr, int missingNum) {
        int[] tempArray = new int[arr.length + 1];

        int index = 0;
        if (isAscending(arr)) {
            index = search(arr, missingNum - 1) + 1;
        } else {
            index = search(arr, missingNum + 1) + 1;
        }

        int j = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (i == index) {
                tempArray[i] = missingNum;
            } else {
                tempArray[i] = arr[j++];
            }
        }
        return tempArray;
    }

    // Checks whether the array is sorted in ascending or descending order.
    private static boolean isAscending(int[] arr) {
        return arr[0] < arr[1];
    }

    static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
