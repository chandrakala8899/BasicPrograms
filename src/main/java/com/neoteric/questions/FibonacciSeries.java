package com.neoteric.questions;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n=10,num1=0,num2=1;
        System.out.println(" fibonacci " +num1+"   "+num2);

        for(int i=2;i<n;i++){
            int num3=num1+num2;
            System.out.println("  " +num3);
            num1=num3;num2=num3;

        }

    }
}
