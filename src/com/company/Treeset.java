package com.company;

import  java.util.*;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> tr=new TreeSet<>(new Sort());
        tr.add(1);
        tr.add(5);
        tr.add(4);
        tr.add(3);
        tr.add(9);
        tr.add(2);
        tr.add(7);
        System.out.println(tr);
    }
}
