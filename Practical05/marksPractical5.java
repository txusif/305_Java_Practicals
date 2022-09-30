// Write a program to create a class Student with rollno and name
// as data members and get member function getDetails() to accept details of one Student
// Create an interface Sports with spmarks as data member to assign 10 marks to each student along with getNssMarks() as
// member function to get nss marks of each student from user .
// Implement the above multiple inheritance by creating a class Marks with 3 subject marks as data members and Display() 
// the average marks of the Student.

import java.util.*;

class Student {
	void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student rollNo: ");
		int sid = sc.nextInt();
		System.out.println("Enter Student name: ");
		String sname = sc.next();
	}
}

interface Sports {
	int spmarks = 10;

	abstract void getNssMarks();
}

class marksPractical5 extends Student implements Sports {
	int nssMarks;

	public void getNssMarks() {
		System.out.println("Enter NSS marks: ");
		Scanner sc = new Scanner(System.in);
		nssMarks = sc.nextInt();
	}

	void Display() {
		int m1, m2, m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Science marks:  ");
		m1 = sc.nextInt();
		System.out.println("Enter Maths marks:  ");
		m2 = sc.nextInt();
		System.out.println("Enter Geography marks:  ");
		m3 = sc.nextInt();
		float avg = (m1 + m2 + m3 + nssMarks + spmarks) / 5;

		System.out.println("Average Marks: " + avg);
	}

	public static void main(String args[]) {
		marksPractical5 obj = new marksPractical5();
		obj.getDetails();
		obj.getNssMarks();
		obj.Display();
	}
}