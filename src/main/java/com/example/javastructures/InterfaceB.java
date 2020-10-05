package com.example.javastructures;

import java.io.FileNotFoundException;

public interface InterfaceB {
    default Integer fun(String v) throws FileNotFoundException {
        return 100;
    }

//    String funLong(String v);
}
