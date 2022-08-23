package com.company;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(3);
        al.add(10);
        al.add(7);
        al.add(1);
        al.add(4);
        al.add(8);
        al.add(5);
        al.sort(new Sorting());
        System.out.println(al);
    }
}
