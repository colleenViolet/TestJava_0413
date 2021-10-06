package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		if (number1 == number2) {
			System.out.println("==");
		}else if(number1 > number2) {
			System.out.println(">");
		}else if (number1 < number2) {
			System.out.println("<");
		}
	}

}