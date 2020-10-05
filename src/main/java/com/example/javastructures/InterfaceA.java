package com.example.javastructures;

public interface InterfaceA {
   default Integer fun(String v) throws IllegalArgumentException{
       someM();
       return 10;
   }

   private void someM(){ //Java 9
       System.out.println("Internal private method");
   }

//   Long funLong(String v);
}
