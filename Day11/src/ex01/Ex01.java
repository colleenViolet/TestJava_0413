package ex01;

public class Ex01 {
	public static void main(String[] args) {
		//객체 지향 프로그램
		//Object - Oriented Programming
		//(간단히 O.o.p라고 줄여서 이야기 한다. )
		
		//사각형 넓이 구하는 메소드와 그에 따른 클라스 만들기 
		Rectangle rect1 = new Rectangle();
		rect1.width = 10;
		rect1.height = 15;
		rect1.count = 3;
		
		// 할당 되어 있는 값을 계산하는 메소드를 불러서 변수에 저장한다. 
		double erea = rect1.calculateErea();
		System.out.println(erea);
		// 갯수에 따른 넓이 값 구하기 
		System.out.println(rect1.calculateEreaCount());
		
		
		
		
		
	}

}
