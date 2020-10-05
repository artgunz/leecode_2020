package com.example.leetcode;

import java.util.Stack;

public class ReverseString {

    public String reverse(String input) {
        StringBuilder stringBuilder = new StringBuilder(); //sb.reverse()
        stringBuilder.reverse();

        char[] chars = input.toCharArray();
        for (int i = input.length() - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }

        return stringBuilder.toString();
    }

    public String reverseNonSB(String input) {
        var chars = input.toCharArray();

        for (var i = 0; i < chars.length / 2; i++) {
            var temp = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = chars[i];
            chars[i] = temp;
        }

        return new String(chars);
    }

    public String reverseWithStack(String input) {
        var chars = input.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (var aChar : chars) {
            stack.push(aChar);
        }

        for (var i = 0; i < chars.length; i++) {
            chars[i] = stack.pop();
        }

        return String.valueOf(chars);
    }
}
