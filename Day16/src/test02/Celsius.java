package test02;

public class Celsius extends Temperature {
	
	public Celsius(double temperature, String unit) {
		super(temperature, unit);
	}

	@Override
	public double changeUnit() {
		double changeFahrenheit = (9/5 * this.getTemperature()) +32;
		return changeFahrenheit;
	}

}
