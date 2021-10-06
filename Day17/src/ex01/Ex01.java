package ex01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = 10;
		System.out.println(number1);
		
		Integer number2 = 10;
		System.out.println(number2);
		
		Integer number3 = new Integer(10);
		System.out.println(number3);
		
		Integer number4 = new Integer(10);
		
		System.out.println(number1 == number2);
		System.out.println(number1 == number3);
		System.out.println(number2 == number3);
		
		System.out.println( number2.equals(number3));
		System.out.println(number3 == number4);
		
		System.out.println(number3.equals(number4));
		
		Integer number5 = 20;
		Integer number6 = 20;
		System.out.println(number5 == number6);
		
	}

}
