package com.mycompany.bai7;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println(names);
        System.out.println("First: " + names.first());
        System.out.println("Last: " + names.last());
        // do string lấy theo danh sách chữ cái nên thứ tự tương ứng với thứ tự trong bảng chữ cái
    }
}
