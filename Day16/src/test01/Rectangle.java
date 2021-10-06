package test01;

public class Rectangle extends Shape {
	
	public Rectangle(int width, int height, String name) {
		// TODO Auto-generated constructor stub
		super(width, height, name);
	}

	@Override
	public double calculateErea() {
		double erea = (this.getHeight() * this.getWidth());
		return erea;
	}

	@Override
	public double calculateRound() {
		double round = (this.getWidth() + this.getHeight()) * 2.0;
		return round;
	}

}
