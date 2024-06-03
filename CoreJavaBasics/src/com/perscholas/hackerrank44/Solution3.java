package com.perscholas.hackerrank44;

public class Solution3 {
    /*
     * Complete the 'lastLetters' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING word as parameter.
     */

    public static String lastLetters(String word) {
        char[] chArray = word.toCharArray();
        return chArray[chArray.length - 1] + " " + chArray[chArray.length - 2];
    }
}
