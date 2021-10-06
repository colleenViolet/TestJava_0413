package ex01;

public class Rectangle {
	int width;
	int height;
	int count;
	
	double calculateErea () {
		double calculateErea = width * height;
		return calculateErea;
	}
	
	double calculateEreaCount() {
		double calculateEreaCount = count *( width * height);
		return calculateEreaCount;
	}
	
	// 출력 함수
	void printRectangle() {
		System.out.println("가로 : " + width + " 세로 : " + height);
	}

}
