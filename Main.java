package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the height of pyramid");
            n = sc.nextInt();
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } while (n >= 1);
        System.out.println("Value cannot be less than one");
    }
}


