package com.neoteric.questions.exceptions;

public class ArrayIndexOutBoundException {
    public static void main(String[] args) {


        int[] x = new int[5]; //index 0-4 and   Lenth = 5 and  last index always length-1
        x[6] = 15;
    }
}
