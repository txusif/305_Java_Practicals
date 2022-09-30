package Practical03;
// Write a java program to implement two static methods addition and multiplication.

import java.util.Scanner;

class Practical3 {
    static int a, b;

    static int addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        return (a + b);
    }

    static void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Multiplication: "+ a * b);
    }

    public static void main(String args[]) {
        int add = addition();
        System.out.println("Addition: "+ add);
        multiplication();
    }
}