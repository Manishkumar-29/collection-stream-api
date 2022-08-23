package com.company;

@java.lang.FunctionalInterface
interface Maths{
    int operation(int a,int b);
}
@java.lang.FunctionalInterface
interface Display{
    void show(String message);
}
public class LambdaExpression {
    public int operateBinary(int a,int b,Maths m){
        return m.operation(a,b);
    }
    public static void main(String[] args) {
        LambdaExpression le=new LambdaExpression();
        Maths addition=(int a,int b)-> a+b;
        Maths subtraction=(int a,int b)-> a-b;
        System.out.println("sum of 20+10 = " + le.operateBinary(20,10,addition));
        System.out.println("Sub of 40-10= "+ le.operateBinary(40,10,subtraction));

        Display display1=message -> System.out.println("hello "+message);
        display1.show("manish");
    }

}
