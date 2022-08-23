package com.company;

import java.util.Comparator;

public class Sort implements Comparator {
    @Override
    public int compare(Object o1,Object o2) {
        int x=(Integer)o1;
        int y=(Integer)o2;
        if (x==y){
            return 0;
        }
        else if (x<=y){
            return 1;
        }
        else return -1;
    }
}
