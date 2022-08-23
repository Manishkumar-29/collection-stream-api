package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        Student s1=new Student(101,"manish",22);
        Student s2=new Student(102,"nitesh",23);
        Student s3=new Student(103,"mihul",21);
        Student s4=new Student(104,"sid",25);
        Student s5=new Student(105,"shyam",27);
        Student s6=new Student(106,"mihul",21);
        al.add(s1);
        al.add(s3);
        al.add(s2);
        al.add(s6);
        al.add(s4);
        al.add(s5);
        System.out.println("before sorting");
        //System.out.println(al);
        Iterator i=al.iterator();
        while (i.hasNext()){
            Student st=(Student) i.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println("After sorting ----by using comparable interface");
        Collections.sort(al);
        Iterator j= al.iterator();
        while (j.hasNext()){
            Student st=(Student) j.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println("by using comparator interface");
        Collections.sort(al,new Name());
        Iterator k= al.iterator();
        while (k.hasNext()){
            Student st=(Student) k.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }


}
