package Homework2;

public class babylonian {

	public double babylonian(double x, double guess, int aError){
		
		double error = Math.abs(x - guess * guess);
		
		if(x < 0){
			return 1;
		}
		
		if(error <= aError){
			return guess;
		}
	}
}
