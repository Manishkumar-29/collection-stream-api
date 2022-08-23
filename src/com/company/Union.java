package com.company;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;

public class Union {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(1);
        al1.add(3);
        al1.add(5);
        al1.add(7);
        al1.add(9);
        al1.add(11);
        al1.add(13);
        boolean z;
        for (int temp:al
             ) {
            z=al1.contains(temp);
            if(z==false){
                al1.add(temp);
            }
        }
        Collections.sort(al1);
        System.out.println(al1);
    }
}
