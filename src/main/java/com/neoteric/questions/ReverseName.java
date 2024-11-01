package com.neoteric.questions;

public class ReverseName {
    public static void main(String[] args) {
        String name = "Chandu";
        StringBuilder name1 = new StringBuilder();
        name1.append(name);
        name1.reverse();
        System.out.println("Reverse Name : " + name1);

        //Using Forloop
        String fatherName = "Ramudu";
        String reverseName = " ";

        for (int i=fatherName.length()-1; i>=0; i--){
            reverseName = reverseName+fatherName.charAt(i);
        }
        System.out.println("Father Reverse Name = " + reverseName);
    }
}
