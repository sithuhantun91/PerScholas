package com.perscholas.hackerrank44;

public class Solution6 {
    /*
     * Complete the 'fourthBit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     */

    public static int fourthBit(int number) {
        if(number <= 7) return 0;
        if(number == 8) return 1;
        int[] binaryNum = new int[31];
        int i = 0;
        while(number > 0){
            binaryNum[i] = number % 2;
            number = number / 2;
            i++;
        }
        return binaryNum[3];
    }
}