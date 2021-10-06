package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//함수 만들기(설계)
//		1. 어떤기능을 만들건가? /이름 짓기(변수는 noun, 함수는 verb)
//		2. 어떤값을 받을것인가? / 메개변수 (parameter)지정		
//		3. 어떤값을 돌려줄 것인가? / return type
		
		System.out.println(getNoodlesPrice(5, 1500));
		
		printHelloWorld();
	}
	
	public static int getNoodlesPrice(int count) {
		int result = 850 * count;
		return result;
	}
	 //오버라이드 
	//* override =같은 이름의 함수를 다른 파라미터로 재정의 할수 있다. 
	
	public static int getNoodlesPrice(int count, int price) {
		int result = price * count;
		return result;
	}
	
	//리턴 타입또는 파라미터가 없는 타입 함수 만들기 
	//헬로 월드를 두번 출력하는 함수
	public static void printHelloWorld() {
		System.out.println("Hello World");
		return;//함수를 정지하고 싶을때 void에서 많이 사용한다. 
		
	}
}
