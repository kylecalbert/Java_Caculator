import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;


public class Main {

	public static void main(String args[] ) {
		Calculator calculator = new Calculator();
		calculator.menu();
		
		
	}
	
}
	
	
class Calculator {
	
	private int sum;
	private int num;

	public void calculator(int num) {
		this.num = num;
	}
	
	private void multiply() {
		sum = sum *num;

		
	}
	
	private void add() {
		sum = sum +num;

		
	}
	
	private void subtract() {
		sum = sum -num;
	
	}
	
	private  void divide() {
	sum = sum/num;


	}
		
		 

void menu() {
	Scanner scanner  = new Scanner(System.in);
	char operator = 'i';
	
	while(true) {
	System.out.println("please enter an operator to use or press E to end");
	operator = scanner.next().charAt(0); 
	if(operator=='E') {
		System.out.println("Calculator closed");
		System.exit(0);;
	}
		
	System.out.println();
	
	System.out.println("please enter a number");
	int num = scanner.nextInt();
	calculator(num);

	switch(operator) {   ///PASS NUMBER IN METHOD...COMPUTE PRINT
	case '+':
		add();
		break;
	
	case '-':
		subtract();
		break;
		
	case '/':
		
		divide();
		break;
	case '*':
		
		multiply();
		break;
	case 'E':
		System.out.println("Calculator closed");
		System.exit(0);
		break;
	default:
		System.out.println("Invalid input , please try again");
		break;

	
}

	System.out.println("Current sum is: " +sum);

	}
	

	

}




}



