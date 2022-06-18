package projects.esii;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter expression: ");
		
		Parser parser = new Parser();
		parser.evaluate(scanner.nextLine());
		System.out.println(parser.printResult());

		scanner.close();
    }
}