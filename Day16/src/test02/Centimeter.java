package test02;

public class Centimeter extends Length {
	
	public Centimeter(double length, String unit) {
		super(length, unit);
	}

	@Override
	public double changeUnit() {
		double changeToInches = this.getLength() / 2.54;
		return changeToInches;
	}

}
