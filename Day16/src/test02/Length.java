package test02;

public abstract class Length {
	
	private double length;
	private String unit;
	
	public Length (double length, String unit) {
		this.length = length;
		this.unit = unit;
	}

	public double getLength() {
		return length;
	}

	public String getUnit() {
		return unit;
	}

	public abstract double changeUnit();

}
