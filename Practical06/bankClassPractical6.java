// Write a java program to demonstrate the real scenario of Java Method Overriding where three classes SBI, ICICI and AXIS are overriding the method getRateOfInterest() of a parent class Bank and allow customer to create an account of their choice of bank.

import java.util.*;

class Bank
{
	String customer;
	int getRateOfInterst()
	{
		return 0;
	}
	void createAccount()
	{
		System.out.println("Hello "+customer+", you can create account in SBI or AXIS or ICICI \n Thank you!");
	}
}

class SBI extends Bank
{
	int getRateOfInterst()
	{
		return 8;
	}
	void createAccount()
	{
		System.out.println("Hello "+customer+", your account is created in SBI bank \nThank you!");
	}
}

class AXIS extends Bank
{
	int getRateOfInterst()
	{
		return 7;
	}
	void createAccount()
	{
		System.out.println("Hello "+customer+", your account is created in AXIS bank \nThank you!");
	}
}

class ICICI extends Bank
{
	int getRateOfInterst()
	{
		return 9;
	}
	void createAccount()
	{
		System.out.println("Hello "+customer+", your account is created in ICICI bank \nThank you!");
	}
}

public class bankClassPractical6
{
	public static void main(String args[])
	{
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		String x = sc.next();

		System.out.println("Enter Bank name either ICICI, AXIS or SBI.");
		String bankName = sc.next();
		
		if(bankName.equalsIgnoreCase("SBI"))
		{
			SBI obj = new SBI();
			obj.customer = x;
			System.out.println("SBI Rate of Interest: "+obj.getRateOfInterst());
			obj.createAccount();
		}

		else if(bankName.equalsIgnoreCase("ICICI"))
		{
			ICICI obj = new ICICI();
			obj.customer = x;
			System.out.println("ICICI Rate of Interest: "+obj.getRateOfInterst());
			obj.createAccount();
		}

			else if(bankName.equalsIgnoreCase("AXIS"))
		{
			AXIS obj = new AXIS();
			obj.customer = x;
			System.out.println("AXIS Rate of Interest: "+obj.getRateOfInterst());
			obj.createAccount();
		}

		else
		{
			System.out.println("Enter bank name either ICICI or AXIS or SBI.");
		}
	}
}