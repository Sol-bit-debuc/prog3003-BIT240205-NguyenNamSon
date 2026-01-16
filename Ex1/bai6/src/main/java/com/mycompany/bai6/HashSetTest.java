package com.mycompany.bai6;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 2, 5, 8, 1,};

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        // HashSet không đảm bảo thứ tự phần tử nên thứ tự in ra có thể khác mảng ban đầu
         
        System.out.println(set);
    }
}
