package com.Clifford;

import java.util.Scanner;

public class Main {
    public static void Kwame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to find the sum:");
        int A = scanner.nextInt();  // Directly reading integer input
        int B = scanner.nextInt();  // Directly reading another integer

        int c = A + B;
        System.out.println("Sum = " + c);
        scanner.close();
    }

    public static void main(String[] args) {
        Kwame();  // Call the method
    }
}



