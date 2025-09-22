package selfProjects;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
			generateEquation();
	}

	public static double generateEquation() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to do a math equation?");
		String response = kb.next();
		while(!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
			System.out.println("Enter \"yes\" or \"no\"!");
			response = kb.next();
		}
		while(response.equalsIgnoreCase("yes")) {
			double a;
			System.out.println("What do you want your first value to be?");
			while(!kb.hasNextDouble()) {
				System.out.println("Enter a number!");
				kb.next();
			}
			a=kb.nextDouble();
			double b;
			System.out.println("What do you want your second value to be?");
			while(!kb.hasNextDouble()) {
				System.out.println("Enter a number!");
				kb.next();
			}
			b = kb.nextDouble();
			System.out.println("Pick your equation type:\n'+' for addition\n'-' for subtraction\n'*' for muitiplication\n'/' for division\n'^' for exponential");
			String symbol = kb.next();
			double result;
			switch(symbol) {
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				if(b==0) {
					System.out.println("Undefined");
					return 0;
				}
				result = a / b;
				break;
			case "^":
				result = Math.pow(a,b);
				break;
			default:
		        System.out.println("Invalid operator!");
		        return 0;
				}
			
			System.out.println(a + symbol + b + "=" + result);
			System.out.println("\n\nWould you like to do another?");
			response = kb.next();
			while(!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
				System.out.println("Enter \"yes\" or \"no\"!");
				response = kb.next();
			}
		}
		System.out.println("thanks for using this calculator");
		return 0;
	}
}
