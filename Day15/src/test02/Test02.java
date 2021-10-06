package test02;

public class Test02 {
	public static void main(String[] args) {
		
//		도형을 관리하고 넓이를 계산하는 원, 삼각형, 사각형 Class 를 설계 하세요.
//		Shape 라고 하는 Class 를 부모로 갖도록 Shape Class 와 각 도형 Class 를 구현하세요.
//		Shape 배열에 객체를 담아서 업캐스팅, 다운캐스팅을 사용해서 아래와 같이 출력 하세요.
//		원주율 pi 는 3.14 로 계산하세요.
		
		Shape[] shape = new Shape[3];

        // upcasting
        shape[0] = new Triangle(8, 10);
        shape[1] = new Rectangle(7, 13);
        shape[2] = new Circle(12);
        
        
        //출력
        for (int i = 0; i < shape.length; i++) {
        	
        	// 초기 문제 푼 방법
        	//1안
//			if(shape[i] instanceof Triangle) {
//				System.out.println("삼각형의 넓이는 " + shape[i].calculateErea() + "cm^2 입니다.");
//			}
//			if(shape[i] instanceof Rectangle) {
//				System.out.println("사각형의 넓이는 " + shape[i].calculateErea() + "cm^2 입니다.");
//			}
//			if(shape[i] instanceof Circle) {
//				System.out.println("원의 넓이는 " + shape[i].calculateErea() + "cm^2 입니다.");
//			}
        	
        	//한줄로 줄이기
        	//클래스의 메소드로 호출 하기 
        	System.out.println(shape[i].getName() + "의 넓이의 값은 "+ shape[i].calculateErea() +"cm^2 입니다. ");
        
        	
		}
		
		
		
	}
}
