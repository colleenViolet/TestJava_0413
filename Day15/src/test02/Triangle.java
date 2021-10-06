package test02;

public class Triangle extends Shape{
	
	public Triangle (int width, int height) {
		super(width, height);
	}
	
	public Triangle(String name) {
		// TODO Auto-generated constructor stub
		super("»ï°¢Çü");
	}
	
	@Override
	public double calculateErea() {
		double erea = (this.getWidth() * this.getWidth() )/2.0;
		return erea;
	}
	
	

}
