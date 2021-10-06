package test02;

public class Rectangle extends Shape{
	
	public Rectangle (int width, int height) {
		super(width, height);
		
	}
	public Rectangle(String name) {
		// TODO Auto-generated constructor stub
		super("»ï°¢Çü");
	}
	
	@Override
	public double calculateErea() {
		double erea = this.getWidth() * this.getWidth();
		return erea;
	}

}
