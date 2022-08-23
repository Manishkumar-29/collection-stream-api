package com.company;

public class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    int getRollno(){
        return rollno;
    }

    @Override
    public int compareTo(Student s) {
        if(this.rollno>s.rollno){
            return 1;
        }
        else if(this.rollno<s.rollno){
            return -1;
        }
        else {
            return 0;
        }
    }
}
