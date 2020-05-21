package com.company;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ThreadOfList list = new ThreadOfList();

        list.add("Jake");
        list.add("Niko");
        list.add("Sam");
        list.add("Mary");
        list.add("Violet");
        System.out.println("List : ");
        list.show();
        System.out.println("List contains of : " + list.size() + " elements");
        System.out.println("______________________________________________________");

        String[] strArr = {"Jake", "sebastian", "Sam", "Violet"};
        list.addAll(strArr);
        System.out.println("List : ");
        list.show();
        System.out.println("List contains of : " + list.size() + " elements.");
        System.out.println("______________________________________________________");

        ArrayList<String> strCll;
        strCll = new ArrayList<>();
        strCll.add("Greg");
        strCll.add("Messiro");
        strCll.add("Oleg");
        strCll.add("Alex");
        strCll.add("Sem");
        strCll.add("Kate");
        strCll.add("Ilon");
        strCll.add("Mary");
        list.addAll(strCll);
        System.out.println("List : ");
        list.show();
        System.out.println("List contains of: " + list.size() + " elements.");
        System.out.println("______________________________________________________");

        list.delete(4);
        list.delete("Alex");
        System.out.println("List : ");
        list.show();
        System.out.println("List contains of: " + list.size() + " elements.");

        System.out.println("______________________________________________________");

        System.out.println("The element with index: " + list.get(2) + " !");
        System.out.println("______________________________________________________");
        System.out.println("Has list this element? - " + list.contains("Sergey"));
        System.out.println("______________________________________________________");
        System.out.println("Is the list equals the collection? - " + (list.compare(strCll)));
        System.out.println("______________________________________________________");
        System.out.println("Trim - " + list.trim());

        list.clear();
        System.out.println("List : ");
        list.show();
        System.out.println("List contains of: " + list.size() + " elements.");
    }
}
