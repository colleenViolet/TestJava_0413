package test04;

public class Test04 {
	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle(15, 26);
		Triangle triangle2 = new Triangle(10, 25);
		
		triangle1.calculateErea();
		triangle2.calculateErea();
		
		System.out.println(triangle1);
		System.out.println(triangle2);
		
		
		if (triangle1.equals(triangle2)) {
			System.out.println("same erea");
		}else {
			System.out.println("different erea");
		}
		
		
	}

}
