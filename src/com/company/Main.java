package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("bye");
		list.add(String.valueOf(list));
		list.add(String.valueOf(1));
		System.out.println("Simple traversal");
		System.out.println(list);
		System.out.println(list.get(2));
		list.set(0,"hello1");
		System.out.println("Iterator traversal");
		Iterator k= list.iterator();
		while(k.hasNext()){
			System.out.println(k.next());
		}
		int x[]={1,-1,2,-2,3,-3,4,-4,3,-1,-8-5,3,-9};
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int j=0;j<x.length;j++){
			al.add(x[j]);
		}
			Iterator<Integer> i = al.iterator();
			while (i.hasNext()) {
				Integer z = i.next();
				if (z.intValue() < 0){
					i.remove();
				}
			}
			al.addAll(al);
		System.out.println(al);
		al.removeAll(al);
		al.clear();
			al.add(1);
			System.out.println(al);
		Collection<String> tslist;
		tslist = Collections.checkedCollection(list,String.class);
		System.out.println("Type safe view is: "+tslist);
	}
}
