// Write a program to handle multiple exceptions such as ArithmeticException, ArrayIndexOutOfBoundsException.

import java.util.Scanner;

class TryCatchPractical8A {
    public static void main(String[] args) {
        try {
            int a, b;
            int c;
            int x[] = { 22, 33, 77, 999 };

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = a / b;
            System.out.println(a + " / " + b + " = " + c);

            System.out.println("5th Element: " + x[5]);
        }

        catch (ArithmeticException e2) {
            System.out.println("You cannot divide a number by ZERO.");
        }

        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Array Index out of range.");
        }

        catch (Exception e3) {
            System.out.println("Exception");
        }

    }
}