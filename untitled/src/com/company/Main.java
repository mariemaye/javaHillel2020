package com.company;

public class Main {

    public static void main(String[] args) {
        Object obj = "Masha";

        if (obj instanceof String s){
            System.out.println(s.length());
        }
    }
}
