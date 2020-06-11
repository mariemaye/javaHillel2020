package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
ArrayList list = new ArrayList<>(Arrays.asList("Nikolay", 13, 16, 19, "Nikolay", 3, 3, 13, 15, 16,77,33,77));
        System.out.println("List with duplicates is : "+ list);
        removeDuplicates(list);
        System.out.println("List without duplicates is: "+list);
    }

    public static <T> void removeDuplicates(ArrayList<T> list){
        Set<T> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

    }
}
