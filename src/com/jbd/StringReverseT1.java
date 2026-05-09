package com.jbd;

import java.util.Scanner;

public class StringReverseT1 {

	public static void main(String[] args) {

		String string;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string : ");
		string = input.nextLine();
		input.close();
		System.out.println("Entered string is : " + string);
		String reverseString = reverseString(string);
		System.out.println("Reverse of " + string + " is : " + reverseString);
	}

	public static String reverseString(String string) {
		char arr[]=string.toCharArray();
		int i=0,j=arr.length-1;
		while(i<j)
		{
			char temp;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return new String(arr);
	}
}
