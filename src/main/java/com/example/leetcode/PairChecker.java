package com.example.leetcode;

import java.util.Arrays;

public class PairChecker {

    public Integer[] getPairForSum(Integer[] inputArray, Integer inputSum) throws IllegalArgumentException{
        //sort the array, the complexity depends on this
        Arrays.sort(inputArray);

        int l = 0;
        int r = inputArray.length - 1;

        boolean founded = false;

        while (l < r){
            if(inputArray[l] + inputArray[r] == inputSum){
                founded = true;
                break;
            }

            if(inputArray[l] + inputArray[r] < inputSum){
                l++;
            }else if(inputArray[l] + inputArray[r] > inputSum)  {
                r--;
            }
        }

        if(founded){
            return new Integer[]{inputArray[l], inputArray[r]};
        }

        throw new IllegalArgumentException("Not found sum " + inputSum + " in array " + Arrays.toString(inputArray));
    }
}
