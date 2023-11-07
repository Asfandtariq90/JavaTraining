package com.qascript;

public class AddNumbers {
    public static void main(String[] args) {

        addnumbers(4,5);
        addnumbers(10,20);
        addnumbers(100,200);

        int result = addnumbers(4,5);
        int output = result + 10;
        System.out.println("Increment the output: " + output) ;


    }
    public static int addnumbers(int num1, int num2){
        int res = num1 + num2;
        System.out.println("Addition of 2 numbers: " + res);
        return res;
    }
}
