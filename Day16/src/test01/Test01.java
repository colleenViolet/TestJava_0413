package test01;

public class Test01 {
	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[2];
		
		shapes[0] = new Rectangle(10, 25, "사각형");
		shapes[1] = new Circle(8, "원");
		
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].returnResult();
		}
		
	}

}
