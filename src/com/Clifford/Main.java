package com.Clifford;

import java.util.Scanner;


public class Main {
    public static void Kwame() {
        Scanner scanner = new Scanner(System.in);

        double a,b,result;
        double c=0;
//User Input
        System.out.println("Enter the time in seconds: ");
        a= scanner.nextDouble();// Directly reading integer input

        c=  a /60;
        result=Math.floor(c);
        b=a%60;

        System.out.println("the time is minutes is "+result+"mins "+b+"seconds");


//        System.out.println("Enter second number");
//        String str,str1;
//        System.out.println("Enter two words:");
//        str=scanner.next();
//        str1=scanner.next();
//
//        if(str.equalsIgnoreCase((str1)))
//            System.out.println(str +" and "+ str1+" are the same");
//        else
//            System.out.println(str +" and "+ str1+" are not the same");
//
//        System.out.println(str.compareTo(str1));
////Addition
//        result = a+b;
//        System.out.println("After adding:" + a +"+"+b +"=" +result);
////Subtraction
//        result = a-b;
//        System.out.println("After subtracting:" + a +"-"+b +"=" +result);
////   Multiplication
//        result = a*b;
//        System.out.println("After Multiplying:" + a +"*"+b +"=" +result);
////Division
//        result = a/b;
//        System.out.println("After Dividing:" + a +"/"+b +"=" +result);
//        scanner.close();   b =scanner.nextInt();  // Directly reading another integer


    }

    public static void main(String[] args) {
//        Kwame();  // Call the method
//        Kwame();  // Call the method
//        Kwame();  // Call the method
        Kwame();  // Call the method





    }
}



