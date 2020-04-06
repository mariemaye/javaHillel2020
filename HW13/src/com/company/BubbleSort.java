package com.company;

public class BubbleSort {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arrayBub;
        arrayBub = new ArrayBub(maxSize);
        arrayBub.insert(12);
        arrayBub.insert(45);
        arrayBub.insert(67);
        arrayBub.insert(00);
        arrayBub.insert(76);
        arrayBub.insert(44);
        arrayBub.display();
        arrayBub.bubbleSort();
        System.out.println("---------");
        arrayBub.display();
    }
}
class ArrayBub{
    private long[] a;
    private int nElement;

    public ArrayBub(int max) {
     a = new long[max];
     nElement = 0;
    }
    public void insert(long value){
        a[nElement] = value;
        nElement++;
    }
    public void display(){
        for (int j = 0; j<nElement; j++){
            System.out.println(a[j]+"");

        }

    }
    public void bubbleSort(){
        int out,in;
        for (out = nElement-1;out>1;out--){
            for (in=0;in<out;in++){
                if(a[in]>a[in+1]) swap(in,in+1);

            }
        }

    }
    private void swap(int one,int two){
        long temp = a[one];
        a[one]=a[two];
        a[two] = temp;
    }
}