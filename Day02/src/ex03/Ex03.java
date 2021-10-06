package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("육개장 가격을 입력하시오.");
//		int noodleCup = scan. nextInt();
//		
//		System.out.println(noodleCup);
//		
//		System.out.println(" 육개장 3개의 가격은"+ (noodleCup*3)+"입니다.");
		System.out.print("육개장 가격:");
		int noodleCup = scan.nextInt();
		System.out.print("갯수:");
		int count =scan.nextInt();
		
		System.out.println("육개장"+count+"개의 가격은 "+(noodleCup*count)+"입니다.");
	}

}
