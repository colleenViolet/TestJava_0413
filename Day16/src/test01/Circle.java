package test01;

public class Circle extends Shape {
	
	double pi = 3.14;
			
	 public Circle(int width, String name) {
		// TODO Auto-generated constructor stub
		 super(width, name);
	}

	@Override
	public double calculateErea() {
		// TODO Auto-generated method stub
		double erea = (this.getWidth() * this.getWidth())* pi;
		return erea;
	}
	
	@Override
	public double calculateRound() {
		double round = (this.getWidth() * 2) * pi;
		return round;
	}

}
