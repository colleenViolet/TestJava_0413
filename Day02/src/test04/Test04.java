package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두수를 입력하시오.");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.println("두수의 곱은"+(number1*number2)+"\n 두수의 합은 "+(number1+number2)+"\n 두수의 차는"+(number1-number2)+"\n 두수의 나눗셈의 값은"+(number1/number2)+"입니다.");
		
		System.out.println("\n 두수를 입력하시오");
		int number3 = scan.nextInt();
		int number4 = scan.nextInt();
		System.out.println("두수를 나눈 몫은"+(number3/number4)+"이고 나머지는 "+(number3%number4)+"입니다.");
		
		System.out.println("\n정사각형의 한변의 길이를 입력하시오");
		int width = scan. nextInt();
		System.out.println("정사각형의 넓이는"+(width*width)+"입니다.");
		
		System.out.println("\n 삼각형의 밑변과 높이를 입력하시오");
		int width1 =scan.nextInt();
		int height = scan.nextInt();
		System.out.println("삼각형의 넓이는 "+(width1*height/2.0)+"입니다.");
		
		System.out.print("\n X:");
		int sample1 =scan.nextInt();
		System.out.print("\n Y:");
		int sample2 =scan.nextInt();
		
		//바뀌치기 하는 경우에 swap을 사용한다. 변수로 한가지 수를 임시 저장 후에 수를 바꿔 치기 하면 된다. 
		int tmp = sample1 ;
		sample1 =sample2;
		sample2 = tmp;
		
		System.out.println("X:"+sample1+" Y:"+sample2);
		
		System.out.println("초를 입력하세요");
		int second = scan.nextInt();
		System.out.println(second+"은"+(second/60)+"분이고"+(second%60)+"초입니다.");
		
		
	}

}
