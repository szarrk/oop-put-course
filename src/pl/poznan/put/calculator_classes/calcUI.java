package calculator_project;

import java.util.Scanner;

public class calcUI {
	private Calculator encapsulatedCalculator;
	
	public calcUI(Calculator calcu) {
		encapsulatedCalculator =  calcu;
	}
	
public void takeCommand(String command) {	
	
	Scanner calcInput = new Scanner(System.in);
	
	if (command.equals("add")) {
		System.out.println("Now please, enter your first number (summand): ");
		double number =  calcInput.nextDouble();
		System.out.println("Now please, enter your second number (summand): ");
		double nextNumber = calcInput.nextDouble();
		System.out.println("Addition operation: " + number + " + " + nextNumber + " = " + encapsulatedCalculator.addition(number, nextNumber));
		}

	if (command.equals("sub")) {
		System.out.println("Now please, enter your first number (minuend): ");
		double number =  calcInput.nextDouble();
		System.out.println("Now please, enter your second number (subtrahend): ");
		double nextNumber = calcInput.nextDouble();
		System.out.println("Subtraction operation: " + number + " - " + nextNumber + " = " + encapsulatedCalculator.subtraction(number, nextNumber));
		}

	if (command.equals("mul")) {
		System.out.println("Now please, enter your first number (multiplicand): ");
		double number =  calcInput.nextDouble();
		System.out.println("Now please, enter your second number (multiplier): ");
		double nextNumber = calcInput.nextDouble();
		System.out.println("Multiplication operation: " + number + " * " + nextNumber + " = " + encapsulatedCalculator.multiplication(number, nextNumber));
		}

	if (command.equals("div")) {
		System.out.println("Now please, enter your first number (dividend): ");
		double number =  calcInput.nextDouble();
		System.out.println("Now please, enter your second number (divisor): ");
		double nextNumber = calcInput.nextDouble();
		
		double divisionResult;
	    try{
	    	divisionResult = encapsulatedCalculator.division(number, nextNumber);
	    	System.out.println("Division operation: " + number + " / " + nextNumber + " = " + divisionResult);
	        }catch(Exception divBy0){
	        System.out.println("Error: " + divBy0);
	        }
	    }

	if (command.equals("power")) {
		System.out.println("Now please, enter your first number (base): ");
		double number =  calcInput.nextDouble();
		System.out.println("Now please, enter your second number (exponent): ");
		double nextNumber = calcInput.nextDouble();
		System.out.println("Power operation: " + number + " to the power of " + nextNumber + " = " + encapsulatedCalculator.power(number, nextNumber));
		}

	if (command.equals("square_root")) {
		System.out.println("Now please, enter your number (base): ");
		double number =  calcInput.nextDouble();
		double sqrtResult;
	    try{
	    	sqrtResult = encapsulatedCalculator.root(number);
	    	System.out.println("The square root of " + number + " = " + sqrtResult);
	        }catch(Exception sqrtLessThan0){
	        System.out.println("Error: " + sqrtLessThan0);
	        }
	    }

	if (command.equals("avg")) {
		System.out.println("Now please, enter your first number: ");
		double number =  calcInput.nextDouble();
		System.out.println("Now please, enter your second number: ");
		double nextNumber = calcInput.nextDouble();
		System.out.println("Average operation of two numbers: " + number + " and " + nextNumber + " = " + encapsulatedCalculator.average(number, nextNumber));
		}

	if (command.equals("logarithm")) {
		System.out.println("Now please, enter your first number (base): ");
		double number =  calcInput.nextDouble();
		System.out.println("Now please, enter your second number (argument): ");
		double nextNumber = calcInput.nextDouble();
		Logarithm newLogarithm = new Logarithm(number, nextNumber);
	    double logarithmResult;
	    try{
	    	logarithmResult = newLogarithm.doubleValue();
	    	System.out.println("Logarithm of " + number + " to the base " + nextNumber + " = " + logarithmResult);
	        }catch(Exception e){
	        System.out.println("Error: " + e);
	        }
		}

	if (command.equals("quit")) {
		System.exit(0);
	}
}
}