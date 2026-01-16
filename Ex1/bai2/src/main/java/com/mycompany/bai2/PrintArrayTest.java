package com.mycompany.bai2;

public class PrintArrayTest {

    public static <E> void printArray(E[] array) {
        for (E e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4};
        String[] strArr = {"A", "B", "C"};

        printArray(intArr);
        printArray(strArr);
    }   
}
