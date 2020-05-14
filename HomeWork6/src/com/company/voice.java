package com.company;

public interface voice {
    default void voice(){
        System.out.println("Hello, ");
    }
}