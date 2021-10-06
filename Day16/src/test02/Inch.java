package test02;

public class Inch extends Length {
	
	public Inch(double length, String unit) {
		super(length, unit);
	}

	@Override
	public double changeUnit() {
		double changeToCentimeter = this.getLength() *2.54 ;  
		return changeToCentimeter;
	}

}
