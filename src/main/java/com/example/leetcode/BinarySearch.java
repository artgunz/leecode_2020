package com.example.leetcode;

public class BinarySearch {

    /**
     * @param inputArray  sorted array for better performance
     * @param valueToFind val
     * @return position
     */
    public int search(int[] inputArray, int valueToFind) {

        if (!isSorted(inputArray)) {
            throw new RuntimeException("Array not sorted");
        }

        int leftPos = 0, rightPos = inputArray.length - 1;

        int iteration = 0;

        while (leftPos < rightPos) {
            iteration++;

            int middlePos = (leftPos + rightPos) / 2;
            System.out.println("Iteration:" + iteration + ": Middle pos " + middlePos);

            if (inputArray[middlePos] == valueToFind) {
                System.out.println("Iteration:" + iteration + ": Value is eq to middlePos pos " + middlePos);
                return middlePos;
            }

            if (valueToFind > inputArray[middlePos]) {
                //desired value in the right part of array
                leftPos = middlePos + 1;
                System.out.println("Iteration:" + iteration + ": Value in the right part, now leftPos is " + leftPos);
            }

            if (valueToFind < inputArray[middlePos]) {
                //desired value in the right part of array
                rightPos = middlePos - 1;
                System.out.println("Iteration:" + iteration + ": Value in the left part, now rightPos is " + rightPos);
            }
        }

        throw new IllegalArgumentException("Cannot find element");
    }

    private boolean isSorted(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] > inputArray[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
