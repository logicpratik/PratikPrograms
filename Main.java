package com.company;

import java.util.Scanner;

public class Main {

    public static void printareaperimeter()
    {        int length;
             int width;

     Scanner sc = new Scanner(System.in);
            System.out.println("Provide Length");
            length = sc.nextInt();
        if (length>0)
           //System.out.println("Length cannot be negative");
           //     else
        System.out.println("Provide width");
            width = sc.nextInt();
//if (width > 0)
        //if (width > 0)

      //  if (width<0)

        //  System.out.println("width cannot be negative");

          //else
            int area = length*width;
            int perimeter = length+width;
            System.out.print("Perimeter=");
        System.out.println(perimeter);
        System.out.print("Area=");
        System.out.println(area);
        //else
        //System.out.println("Input cannot be nagative");
        //break;
    }
  //  public static void perimeter()
    //{
      //  int length;
        //int width;

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Provide Length");
        //length = sc.nextInt();
        //System.out.println("Provide width");
        //width = sc.nextInt();
        //int perimeter = length+width;
        //System.out.print("perimeter=");
        //System.out.println(perimeter);



    public static void main(String[] args) {
	// write your code here
        //to provide square of the user given number

       // public static void printarea(int length,int width)
    //{ int area = length * width;
//        System.out.println(area);}

        //Scanner sc = new Scanner(System.in);
        //do {
          //  System.out.println("Provide Length");
            //length = sc.nextInt();
            //System.out.println("Provide width");
            //width = sc.nextInt();
           //if (length < 0)
             //  System.out.println("Length or Width cannot be negative");

           // else
             //printarea();


//break;

//        }while (area < 1000000);
printareaperimeter();

    }
}
