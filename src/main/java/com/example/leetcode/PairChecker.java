package com.example.leetcode;

import java.util.Arrays;

public class PairChecker {

    public Integer[] getPairForSum(Integer[] inputArray, Integer inputSum) throws IllegalArgumentException{
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

    public Integer[] getTripleForSum(Integer[] inputArray, Integer inputSum) throws IllegalArgumentException{
        //sort the array, the complexity depends on this
//        Arrays.sort(inputArray);

        int length = inputArray.length;

        for (int i = 0; i < length-2; i++) {
            for (int j = i+1; j < length-1; j++) {
                for (int k = j+1; k < length; k++) {
                    if(inputArray[i]+inputArray[j]+inputArray[k] == inputSum){
                        return new Integer[]{inputArray[i],inputArray[j],inputArray[k]};
                    }
                }
            }
        }

        throw new IllegalArgumentException("Not found sum " + inputSum + " in array " + Arrays.toString(inputArray));
    }

    public Integer[] getPairForSumSimple(Integer[] inputArray, Integer inputSum) throws IllegalArgumentException{
        Arrays.sort(inputArray);

        int length = inputArray.length;

        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                    if(inputArray[i]+inputArray[j] == inputSum){
                        return new Integer[]{inputArray[i],inputArray[j]};
                    }

            }
        }

        throw new IllegalArgumentException("Not found sum " + inputSum + " in array " + Arrays.toString(inputArray));
    }
}
