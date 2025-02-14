package com.Clifford;

import java.util.Scanner;

public class Main {
    public static void Kwame() {
        Scanner scanner = new Scanner(System.in);

        int a,b,result;
//User Input
        System.out.println("Enter first number");
        a= scanner.nextInt();  // Directly reading integer input

        System.out.println("Enter second number");
        b =scanner.nextInt();  // Directly reading another integer
//Addition
        result = a+b;
        System.out.println("After adding:" + a +"+"+b +"=" +result);
//Subtraction
        result = a-b;
        System.out.println("After subtracting:" + a +"-"+b +"=" +result);
//   Multiplication
        result = a*b;
        System.out.println("After Multiplying:" + a +"*"+b +"=" +result);
//Division
        result = a/b;
        System.out.println("After Dividing:" + a +"+"+b +"=" +result);
        scanner.close();
    }

    public static void main(String[] args) {
        Kwame();  // Call the method
    }
}



