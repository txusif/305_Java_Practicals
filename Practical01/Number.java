package Practical01;
// Write a java orogram to create a class Number with data members n1,n2 intialise the data member with constructor overloading. Write two memebr functions such as addition and multiplication which returns the respective results.

import java.util.*;

class Number {
    int n1, n2;
    Scanner sc = new Scanner(System.in);

    public Number() {
        System.out.print("a = ");
        n1 = sc.nextInt();
        System.out.print("b = ");
        n2 = sc.nextInt();
    }

    public Number(int a, int b) {
        n1 = a;
        n2 = b;
    }

    public int Addition() {
        return n1 + n2;
    }

    public int Multiplication() {
        return n1 * n2;
    }

    public static void main(String args[]) {
        Number obj = new Number();
        int val1 = obj.Addition();
        System.out.println("a+b=" + val1);
        int val2 = obj.Multiplication();
        System.out.println("a*b=" + val2);
        
        System.out.println("Input= 10,10");
        Number obj2 = new Number(10, 10);
        int val3 = obj2.Addition();
        System.out.println("a+b=" + val3);
        int val4 = obj2.Multiplication();
        System.out.println("a*b=" + val4);
    }
}