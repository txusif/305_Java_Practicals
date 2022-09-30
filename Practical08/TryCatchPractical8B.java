// Write a program to demonstrate the use of user defined exception "InvalidageException".

import java.util.*;

class InvalidageException extends Exception {
    public InvalidageException(String msg) {
        super(msg);
    }
}

class TryCatchPractical8B {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            if (age > 18) {
                System.out.println("You're eligible for Voting.");
            } else
                throw new InvalidageException("You're not eligible for Voting.");

        }

        catch (InvalidageException e) {
            System.out.println("User Defined Error Class " + e);
        }
    }
}