package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int weight = 80;
		
		if (weight <= 70) {
			System.out.println("Ä¡Å²¸ÔÀÚ");
		}else {
			System.out.println("»ø·¯µå ¸ÔÀÚ");
		}
		
		if(weight <= 70) {
			System.out.println("Ä¡Å²¸ÔÀÚ");
		}else if (weight <= 75) {
			System.out.println("´ß°¡½¿»ì¸ÔÀÚ");
		}else if (weight <= 80) {
			System.out.println("»ø·¯µå ¸ÔÀÚ");
		}else {
			System.out.println("¿îµ¿ÇÏÀÚ");
		}
	}

}
