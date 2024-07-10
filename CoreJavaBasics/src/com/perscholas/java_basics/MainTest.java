package com.perscholas.java_basics;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
//        String encrypted = "CDEF";
//        int k = 2;
//        Map<Integer,String> wheel = new HashMap<>();
//        String result = "";
//        for (int i = 0; i < 26; i++) {
//            wheel.put(65 + i, new Character((char)(65 + i)).toString());
//        }
//        char[] characters = encrypted.toCharArray();
//        for (char c : characters) {
//            int ascci = (int)c - k;
//            if(ascci < 65) ascci += 26;
//            result += wheel.get(ascci);
//        }
//        System.out.println(result);

        List<String> text = new ArrayList<>();
        text.add("code");
        text.add("aaagmnrs");
        text.add("anagrams");
        text.add("doce");
        if(text.size() == 1){
            System.out.println(Arrays.toString(text.toArray()));
        }
        Set<String> set = new HashSet<>();
        Stack<String> stack = new Stack<>();
        char[] chars;
        int size = text.size();
        String textOrigin = text.get(0);
        String textSorted = textOrigin;
        chars = textSorted.toCharArray();
        Arrays.sort(chars);
        textSorted = new String(chars);
        stack.push(textOrigin);
        set.add(textSorted);
        for (int i = 1; i < size; i++) {
            String temp = text.get(i);
            chars = temp.toCharArray();
            Arrays.sort(chars);
            temp = new String(chars);
            if(set.add(temp)){
                stack.push(text.get(i));
            }
        }
        System.out.println(Arrays.toString(stack.toArray()));
        //return (List<String>)new ArrayList<>(stack);
    }
}