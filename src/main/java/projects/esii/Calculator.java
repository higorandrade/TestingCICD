package projects.esii;

public class Calculator {
	public double sum(double a, double b) {
		return a+b;
	}
	
	public double subtraction(double a, double b) {
		return a-b;
	}
	
	public double multiplication(double a, double b) {
		return a*b;
	}
	
	public double division(double a, double b) {
		return a/b;
	}
	
	public double pow(int a, int b) {
		if(b<0) return division(1, (double) pow(a, b*-1));
		int pow = 1;
		for(int i=0; i<b; i++) {
			pow *= a;
		}
		return pow;
	}
	/*
	public int factorial(int a) {
		int fact = 1;   
		for(int i=1; i<=a; i++){    
			fact = fact*i;    
		}
		return fact;
	}
	*/
}