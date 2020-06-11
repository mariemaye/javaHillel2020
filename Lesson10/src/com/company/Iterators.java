package com.company;

import java.util.Iterator;

public class Iterators implements Iterator {
    int[] arr;
    int startIndex;

    public Iterators(int size, int startIndex) {
        arr = new int[size];
        this.startIndex = startIndex;
    }

    @Override
    public boolean hasNext() {
        return startIndex < arr.length;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            return -1;
        }
        return arr[startIndex++];
    }

    public void getFirst() {
        System.out.println("Первый элемент массива "+arr[0]);

    }

    public void getIndex(int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                System.out.println("Индекс элемента массива "+i);
                return;
            }
        }
        System.out.println("Нет такого элемента массива");
    }

    public static void main(String[] args) {
        Iterators Iterator = new Iterators(10, 0);
        for (int i = 0; i < Iterator.arr.length; i++) {
            Iterator.arr[i] = i;
        }
        for (int i = 0; i < Iterator.arr.length; i++) {
            System.out.println(Iterator.arr[i] = (int) (Math.random() * 15));
        }
        System.out.println(Iterator.hasNext());
        System.out.println(Iterator.next());
        Iterator.getFirst();
        Iterator.getIndex(5);
    }
}