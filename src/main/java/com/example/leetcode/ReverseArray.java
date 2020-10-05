package com.example.leetcode;

import java.io.Serializable;

public class ReverseArray<T extends Serializable> {

    public T[] reverse(T[] inputArray){
        // TODO: 03.10.2020 do not mutate inout val
        //[1,2,3,4]
       for (var i= 0; i < inputArray.length/2; i++){
           //0: i=0, temp=4-0-1=3=[4]

           System.out.println("i="+i);

           T temp = inputArray[inputArray.length - i -1];
           System.out.println("temp="+temp.toString());

           inputArray[inputArray.length - i -1] = inputArray[i];
           System.out.println("inputArray.length - i -1="+inputArray[i].toString());

           inputArray[i] = temp;
           System.out.println("inputArray[i]="+inputArray[i].toString());
       }

       return inputArray;
    }
}
