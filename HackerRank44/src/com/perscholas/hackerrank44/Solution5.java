package com.perscholas.hackerrank44;

public class Solution5 {
    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static StringBuilder fizzBuzz(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sb.append("FizzBuzz\n");
            }else if(i % 3 == 0){
                sb.append("Fizz\n");
            }else if(i % 5 == 0){
                sb.append("Buzz\n");
            }else{
                sb.append(i).append("\n");
            }
        }
        return sb;
    }
}
