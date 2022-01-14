package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);
        System.out.println("what is the number of subjects");
        int size = input.nextInt();

        int marks[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("What is the marks in subject" + (i + 1));
            marks[i] = input.nextInt();
            //  System.out.println("Marks in subject" + i + 1 + "is" + marks[i]);


        }
        for (int i = 0; i < size; i++) {
            System.out.println("Marks in subject " + (i + 1) + " are " + marks[i]);
        }
    }
}
