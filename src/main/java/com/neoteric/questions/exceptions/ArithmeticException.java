package com.neoteric.questions.exceptions;

public class ArithmeticException extends Throwable {
        public static void main(String[] args) {


            try {
                int a = 10;
                int b = 0;
                int result = a / b; // This will cause an ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithematicExceoption e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            }

            System.out.println("Program continues after the exception handling.");
        }
    }



