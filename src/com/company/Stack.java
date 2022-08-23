package com.company;

public class Stack {
    public static void main(String[] args){
        String str="[{()}]";
        int x=str.length();
        java.util.Stack<Character> st=new java.util.Stack<>();
        for(int i = 0; i < x; i++) {

            char ch = str.charAt(i);

            if(!st.isEmpty() && ch == '}' && st.peek() == '{') {
                st.pop();

            } else if(!st.isEmpty() && ch == ')' && st.peek() == '(') {
                st.pop();

            } else if(!st.isEmpty() && ch == ']' && st.peek() == '[') {
                st.pop();

            } else {
                st.push(ch);
            }

        }
        boolean z=st.isEmpty();
        if (z==true){
            System.out.println("Matched");
        }
        else {
            System.out.println("Not matched");
        }
    }
}
