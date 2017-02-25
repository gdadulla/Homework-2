package Homework2;

import java.util.Scanner;

public class babylonian {

	public static double Babylonian(double x, double guess, int aError){
		
		double error = Math.abs(x - guess * guess);
		System.out.println(error + ": error");
		
		if(x < 0){
			return 1;
		}
		
		if(error <= aError){
			return guess;
		}
		
		else{
			double newGuess = 0.5 * (guess + x / guess);
			System.out.println(newGuess + ": newGuess");
			return Babylonian(x, newGuess, aError);
		}
	}
	
	public static void main (String [] args){
		Scanner s = new Scanner(System.in);
		double x = Double.parseDouble(s.nextLine());
		int aError = Integer.parseInt(s.nextLine());
		double guess = x/2;
		System.out.println(Babylonian(x, guess, aError));
	}
}
