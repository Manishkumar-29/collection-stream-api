package com.company;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(3);
        al1.add(4);
        boolean z;
        System.out.println("Intersection of two sets is");
        for (int temp:al
             ) {
            z=al1.contains(temp);
            if (z==true){
                System.out.print(temp+" ");
            }
        }
        System.out.println("");
    }
}
