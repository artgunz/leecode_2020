package com.example.leetcode;

import java.util.Arrays;

public class SortArray<T extends Integer> {
    public T[] bubbleSort(T[] inputArray, boolean reverse) {
        for (int i = 0; i < inputArray.length; i++) {

            //inner loop that less by 1 of the outer
            for (int j = 0; j < inputArray.length - i - 1; j++) {

                //current element bigger than next element - swap

                boolean swap = false;
                if(reverse && inputArray[j].compareTo(inputArray[j + 1]) < 0){
                    swap = true;
                } else if(!reverse && inputArray[j].compareTo(inputArray[j + 1]) > 0){
                    swap = true;
                }

                if (swap) {
                    //swap logic
                    T temp = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        return inputArray;
    }

    public T[] mergeSort(T[] inputArray) {
        Integer middle = inputArray.length / 2;

        //no extra sub-arrays
        if (middle <= 0) {
            return order(inputArray);
        }

        T[] lArray = Arrays.copyOfRange(inputArray, 0, middle);
        lArray = mergeSort(lArray);

        T[] rArray = Arrays.copyOfRange(inputArray, middle, inputArray.length);
        rArray = mergeSort(rArray);


        throw new RuntimeException("Not impl");
    }

    private T[] order(T[] inputArray) {
        if (inputArray.length == 1) {
            return inputArray;
        }

        if (inputArray.length == 2) {
            if (inputArray[0].compareTo(inputArray.length - 1) > 0) {
                T temp = inputArray[inputArray.length - 1];
                inputArray[inputArray.length - 1] = inputArray[0];
                inputArray[0] = temp;
            }
        }

        throw new IllegalArgumentException("Need to devide array by smaller parts " + Arrays.toString(inputArray));
    }
}
