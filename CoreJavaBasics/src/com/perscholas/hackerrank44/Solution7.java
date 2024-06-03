package com.perscholas.hackerrank44;

import java.util.List;
import java.util.stream.Collectors;

public class Solution7 {
    /*
     * Complete the 'getMinDeletions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int getMinDeletions(String s) {
        List<Character> charList = s.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        List<Character> afterRemoveDuplicateList =charList.stream().distinct().collect(Collectors.toList());
        return charList.size() - afterRemoveDuplicateList.size();
    }
}
