package com.example.leetcode;

import java.util.Arrays;

public class AnagramStringCheck {
    public boolean check(String  first, String second){
        char[] fa = first.toCharArray(), sa  = second.toCharArray();

        Arrays.sort(fa);
        Arrays.sort(sa);

        return Arrays.equals(fa, sa);
    }

    public boolean polindrome(String f, String s){
        return f.equals(reverseString(s));
    }

    private String reverseString(String input){
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[chars.length-i-1];
            chars[chars.length-i-1] = chars[i];
            chars[i] = temp;
        }
        return String.valueOf(chars);
    }
}
