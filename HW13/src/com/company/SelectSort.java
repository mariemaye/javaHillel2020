package com.company;

public class SelectSort {
    public static void main(String[] args) {
        int maxSize = 100;
    ArraySort arraySort;
    arraySort = new ArraySort(maxSize);
    arraySort.insert(13);
    arraySort.insert(16);
    arraySort.insert(88);
    arraySort.insert(00);
    arraySort.insert(190);
    arraySort.insert(45);
    arraySort.insert(32);
    arraySort.display();
    arraySort.selectionSort();
        System.out.println("--------");
    arraySort.display();
    }
}
class  ArraySort{
    private long[] a;
    private int nElement;



    public ArraySort(int max)
    {
        a = new long[max];
        nElement = 0;
    }
    public void insert(long value)
    {
        a[nElement] = value;
        nElement++;
    }
    public void display()
    {
        for(int j=0; j<nElement; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }
    public void selectionSort()
    {
        int out, in, min;
        for(out=0; out<nElement-1; out++)
        {
            min = out;
            for(in=out+1; in<nElement; in++)
                if(a[in] < a[min] )
                    min = in;
            swap(out, min);
        } }
    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
