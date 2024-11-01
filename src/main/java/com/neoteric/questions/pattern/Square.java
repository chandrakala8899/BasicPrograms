package com.neoteric.questions.pattern;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
