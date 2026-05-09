package com.jbd;

import java.util.Scanner;

public class PattenMatching1 {
	
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
    
        for (int i = 0; i < 4 ; i++ ) {
            
            for(int j = 0; j < 4; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        } 
	}
}