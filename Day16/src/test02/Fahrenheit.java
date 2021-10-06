package test02;

public class Fahrenheit extends Temperature {
	
	public Fahrenheit(double temperature, String unit) {
		super(temperature, unit);
	}

	@Override
	public double changeUnit() {
		double changeCelsius = (this.getTemperature() - 32)* 5/9;
		return changeCelsius;
	}

}
