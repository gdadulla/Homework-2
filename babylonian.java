/*
 * Germaine Dadulla
 * CSI 213
 * Professor Magnus
 * February 26, 2017
 * 
 * H2.1: Recursion (Complete) 
 */
package Homework2;

//imports Scanner
import java.util.Scanner;

public class babylonian {

	//Babylonian method that calculates the square root of a number
	public static double Babylonian(double x, double guess, int aError){
		
		//variable error that calculates error
		double error = Math.abs(x - guess * guess);
		
		//prints out error
		System.out.println(error + ": error");
		
		//base case
		if(x <= 0){
			return 1;
		}
		
		//statement that returns guess if the error < accepted error
		if(error <= aError){
			return guess;
		}
		
		//else statement that returns Babylonian recursively
		else{
			
			//variable newGuess that calculates a new guess
			double newGuess = 0.5 * (guess + x / guess);
			
			//prints out newGuess
			System.out.println(newGuess + ": newGuess");
			
			//returns Babylonian(x, newGuess, aError
			return Babylonian(x, newGuess, aError);
		}
	}
	
	//test method
	public static void main (String [] args){
		
		//Creates a new Scanner to be used to input numbers for variables x and accepted error
		Scanner s = new Scanner(System.in);
		
		//variable x and aError are initilized through the scanner
		double x = Double.parseDouble(s.nextLine());
		int aError = Integer.parseInt(s.nextLine());
		
		//variable guess is initialized at x/2
		double guess = x/2;
		
		//prints out Babylonian
		System.out.println(Babylonian(x, guess, aError));
	}
}
