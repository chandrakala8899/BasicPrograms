package com.neoteric.questions;

public class PrimeNumber {
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

   // public static void main(String[] args) {
//            int num = 29; // You can change this number to check other numbers
//            if (isPrime(num)) {
//                System.out.println(num + " is a prime number.");
//            } else {
//                System.out.println(num + " is not a prime number.");
//           }

        public static void main (String[]args){
            System.out.println("Prime numbers from 1 to 100:");

            for (int num = 1; num <= 100; num++) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        }
    }



