package com.neoteric.questions;


public class ReverseNumber {
    public static  void main(String[] args) {

    int number = 1234;
    int reverseNumber = reverse(number);
        System.out.println(" Original Number : " + number);
        System.out.println(" Reverse Number : " + reverseNumber);
    }
    public static  int reverse(int number){
        int reverseNumber = 0;
        while(number!=0){
            int digit = number % 10;
            reverseNumber = reverseNumber*10+digit;
            number /= 10;
        }
     return  reverseNumber;
    }
}
