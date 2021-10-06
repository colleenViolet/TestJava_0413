package ex02;

public class Ex02 {
	//Math 
	public static void main(String[] args) {
		//함수 사용하기 
		
		//반올림 함수 
		double number = 3.14;
		
		long result = Math.round(number);
		System.out.println(result);
		
		System.out.println(Math.round(number));
		
		//큰값 구하기
		int number2 = Math.max(101, 256);
		System.out.println(number2);
		//max는 두 값중 하나의 큰수를 고르는 함수이다. 
		
		//절댓값구하는 함수
		int number3 = Math.abs(-6);
		System.out.println(number3);
		
		
	}
}
