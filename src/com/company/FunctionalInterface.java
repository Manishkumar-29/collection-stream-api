package com.company;

@java.lang.FunctionalInterface
interface Area{
    int calculate(int x);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread created");
            }
        }).start();

        new Thread(() -> {
            System.out.println("Second thread Created");
        }).start();
        int z=5;
        //Area of square
        Area a=(int x) -> x*x;
        int result=a.calculate(z);
        System.out.println("Area of Square  "+ z);
    }
}
