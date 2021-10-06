package test02;

public class Circle extends Shape{
	
	double pi = 3.14;
	
	public Circle(int width) {
		super(width);
		
	}
	
	public Circle (String name) {
		// TODO Auto-generated constructor stub
		super("¿ø");
	}
	
	@Override
	public double calculateErea() {
		double erea = (this.getWidth() * this.getWidth())*pi;
		return erea;
	}
	
	

}
