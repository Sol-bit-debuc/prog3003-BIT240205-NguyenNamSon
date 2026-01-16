
package com.mycompany.bai3;
public class Main {
    
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<>("MSSV", 10170);
        Pair<String, String> p2 = new OrderedPair<>("HoTen", "Nguyen Thi Hoa");

        System.out.println(p1.getKey() + ": " + p1.getValue());
        System.out.println(p2.getKey() + ": " + p2.getValue());
    }
}


