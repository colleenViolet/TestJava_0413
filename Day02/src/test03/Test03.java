package test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력하시오");
		int age =scan.nextInt();
		
		System.out.println("\n이름은 이도경 나이는 "+age+"입니다.");
		
		System.out.println("\n두 수를 입력하시오");
		int number1 =scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println(number1+"+"+number2+"="+(number1+number2));
		System.out.println(number1+"-"+number2+"="+(number1-number2));
		
		System.out.println("\n 단수를 입력하세요.");
		int simple =scan.nextInt();
		System.out.println(simple+"x1="+(simple*1));
		System.out.println(simple+"x2="+(simple*2));
		System.out.println(simple+"x3="+(simple*3));
		System.out.println(simple+"x4="+(simple*4));
		System.out.println(simple+"x5="+(simple*5));
		
		System.out.print("\n 원의 지름 값을 입력 하시오 :");
		int diameter=scan.nextInt();
		int radius = diameter/2;
		System.out.println("\n 원의 넓이는 "+(radius*radius*3.14)+"입니다.");
	
		
		
		
		
	}

}
