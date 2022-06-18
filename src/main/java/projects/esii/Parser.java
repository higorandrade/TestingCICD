package projects.esii;

import java.util.Scanner;

public class Parser {
	private Calculator calculator;
	private double partialResult;
	
	public Parser() {
		this.calculator = new Calculator();
		partialResult = 0;
	}
	
	public void evaluate(String expression) {
		Scanner parse = new Scanner(expression);
		
		this.partialResult = parse.nextDouble();
		
		while(parse.hasNext()) {
			String operator = parse.next();
	    	switch(operator) {
				case "+":
					this.partialResult = this.calculator.sum(this.partialResult, parse.nextDouble());
					break;
				case "-":
					this.partialResult = this.calculator.subtraction(this.partialResult, parse.nextDouble());
					break;
				case "*":
					this.partialResult = this.calculator.multiplication(this.partialResult, parse.nextDouble());
					break;
				case "/":
					this.partialResult = this.calculator.division(this.partialResult, parse.nextDouble());
					break;
				case "^":
					this.partialResult = this.calculator.pow((int) this.partialResult, parse.nextInt());
	    	}
	    	
	    	if(Double.isInfinite(this.partialResult) || Double.isNaN(this.partialResult)) {
	    		parse.close();
	    		return;
	    	}
		}
		
		parse.close();
	}
	
	public double getPartialResult() {
		return this.partialResult;
	}
	
	public String printResult() {
		if(Double.isInfinite(this.partialResult) || Double.isNaN(this.partialResult)) return "Error: Can't divide by zero!";
		return "The result is " + this.partialResult + ".";
	}
}