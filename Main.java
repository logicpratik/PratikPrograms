package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str = "Pratik Patwardhan";
        char name[] = new char[40];
        str.getChars(0, 17, name, 0);
        for (int i = 16; i >= 0; i--) {
            {
                System.out.print(name[i]);
            }
        }
    }
}
