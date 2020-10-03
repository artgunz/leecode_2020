package com.example.javastructures;

public interface InterfaceA {
   default Integer fun(String v){
       return 10;
   }

//   Long funLong(String v);
}
