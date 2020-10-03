package com.example.javastructures;

public interface InterfaceB {
    default Integer fun(String v){
        return 100;
    }

//    String funLong(String v);
}
