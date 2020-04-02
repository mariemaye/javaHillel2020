package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
     class ArrayList <T> {
         @Override
         public String toString() {
             return "ArrayList" +

                     " =" + Arrays.toString(array) +
                     "";
         }

         private final int INIT_SIZE = 4;
            private final int CUT_RATE = 4;
            private Object[] array = new Object[INIT_SIZE];
            private int pointer = 0;


            public void add(T item) {
                if(pointer == array.length-1)
                    resize(array.length*2);
                array[pointer++] = item;
            }

            public T get(int index) {
                return (T) array[index];
            }


            public void remove(int index) {
                for (int i = index; i<pointer; i++)
                    array[i] = array[i+1];
                array[pointer] = null;
                pointer--;
                if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
                    resize(array.length/2);
            }

            public int size() {
                return pointer;
            }


            private void resize(int newLength) {
                Object[] newArray = new Object[newLength];
                System.arraycopy(array, 0, newArray, 0, pointer);
                array = newArray;
            }
         public boolean contains(Object o){
             if (o.equals("Sandy")) return true;
else return false;
         }
         public boolean equals(Object obj) {
             return (this == obj);
         }

     }



       ArrayList arrayList = new ArrayList<>();

     arrayList.add("Tommy");
        System.out.println();
     arrayList.add("Nansy");
     arrayList.add("Sandy");
     arrayList.get(1);
 arrayList.toString();
        System.out.println(arrayList.toString());
     arrayList.size();
        System.out.println("Array size - " + arrayList.size());
        arrayList.remove(1);
        System.out.println("The element with index is "+arrayList.get(1));

        System.out.println(arrayList.contains("Sandy"));
        System.out.println(arrayList.equals("Tommy"));

    }



}
