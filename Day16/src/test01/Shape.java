package test01;

public abstract class Shape {
	
	private int width;
	private int height;
	private String name;
	

	public Shape (int width, int height, String name) {
		this.height = height;
		this.width = width;
		this.name = name;
	}
	
	public Shape (int width, String name) {
		this.width = width;
		this.name = name;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract double calculateErea(); 
	public abstract double calculateRound(); 
	
	public void returnResult() {
		System.out.println(this.name + "넓이는 " + this.calculateErea() + " 둘레는 " + this.calculateRound());
	}
	

	
	
	

}
