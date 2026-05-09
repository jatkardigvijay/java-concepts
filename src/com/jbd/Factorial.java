package com.jbd;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int i1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string : ");
		i1 = input.nextInt();
		input.close();
		System.out.println("Entered string is : " + i1);
		int i2 = factorial(i1);
		System.out.println("Factorial of " + i1 + " is : " + i2);
	}

	public static int factorial(int i1) {
		
		//5!=5*4*3*2*1=120
		int fact=1;
		for(int i=i1;i>=2;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}
