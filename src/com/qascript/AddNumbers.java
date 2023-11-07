package com.qascript;

public class AddNumbers {
    public static void main(String[] args) {

        addnumbers(4,5);
        addnumbers(10,20);
        addnumbers(100,200);

    }
    public static void addnumbers(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Addition of 2 numbers: " + result);
    }
}
