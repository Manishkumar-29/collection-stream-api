package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<Student> st=new ArrayList<Student>();
        st.add(new Student(1,"manish",20));
        st.add(new Student(2,"tallib",24));
        st.add(new Student(3,"mihul",22));
        st.add(new Student(4,"rishab",25));
        st.add(new Student(5,"sid",22));
        List<Integer> a=st.stream().filter(ag -> ag.age>22).map(ag -> ag.age).collect(Collectors.toList());
        System.out.println(a);
        st.stream().filter(ag -> ag.age>22).forEach(ag-> System.out.println(ag.name));
        //List<Integer> list=st.stream().filter(ag1 -> ag1.rollno!=2).collect(Collectors.toList());
        st= (ArrayList<Student>) st.stream().filter(ag1-> ag1.rollno!=2).collect(Collectors.toList());
        System.out.println(st);
        List<Integer> z=st.stream().filter(ag2-> ag2.rollno==5).map(ag2-> ag2.age).collect(Collectors.toList());
        System.out.println(z);
        for (Student add:st
             ) {
            System.out.println(add.age);
        }
        Student x=st.stream().max((c,b)-> c.age>b.age? 1:-1).get();
        System.out.println(x.name+" "+x.age);
        Student y=st.stream().min((c,b)-> c.age>b.age? 1:-1).get();
        System.out.println(y.name+" "+y.age);
        System.out.println(st);
        st.parallelStream().forEach(System.out::println);
    }
}
