package com.calculator;
import java.util.Scanner;

class Main {
	  public static void main(String[] args) {

	    char operator;
	    Double number1, number2, result;

	     Scanner input = new Scanner(System.in);
	     
	     System.out.println("Enter first number");
		    number1 = input.nextDouble();

		 System.out.println("Enter second number");
		    number2 = input.nextDouble();

        System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	     switch (operator) {

	      // addition between numbers
	      case '+':
	        result = number1 + number2;
	        System.out.println( "Addition: "+number1 + " + " + number2 + " = " + result);
	        break;

	      // subtraction between numbers
	      case '-':
	        result = number1 - number2;
	        System.out.println( "Subtraction: "+number1 + " - " + number2 + " = " + result);
	        break;

	      // multiplication between numbers
	      case '*':
	        result = number1 * number2;
	        System.out.println("Multiplication: "+number1 + " * " + number2 + " = " + result);
	        break;

	      // division between numbers
	      case '/':
	        result = number1 / number2;
	        System.out.println("Division: "+number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }
	}
