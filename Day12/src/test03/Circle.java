package test03;

public class Circle {
//	원 을 Class 로 설계하세요.
//	학원에서 학생 관리를 위한 학생 Class 를 설계하세요.
//	생성자와 접근제어자를 이용해서 캡슐화 철학에 맞게 설계 하세요.
//	멤버 변수는 아래를 참조 하세요.
//	반지름
//	메소드는 아래 를 참조하세요
//	넓이 구하기, 둘레 구하기, 갯수에 따른 넓이 구하기
//
//	pi는 3.14
//
//	원 Class를 이용하여 반지름이 8인 원의 객체를 만들고, 아래 내용을 출력 하세요.
	
	int radius;
	private double pi = 3.14;

	public double getDimensions() {
		double dimensions = radius * radius * pi;
		return dimensions;
		
	}
	
	public double round() {
		double round = 2 * radius * pi;
		return round;
		
	}
	
	public double countDimensions(int count) {
		double countDimensions = count * (radius * radius * pi);
		return countDimensions;
		
	}
	

}
