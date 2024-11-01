package com.neoteric.questions;

import java.util.Scanner;

public class PalindromeString {
    public  static void main(String[] agrs){
    String name = "Chandu";
    String name2 = new StringBuilder(name).reverse().toString();

        System.out.println(name.equals(name2));



        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String reversedStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reversedStr))
            System.out.println(str + " is a palindrome.");
        else System.out.println(str + " is not a palindrome.");

    }
}
