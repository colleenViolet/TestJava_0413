package test02;

public abstract class Temperature {
	
	private double temperature;
	private String unit;
	
	public Temperature (double temperature, String unit) {
		this.temperature = temperature;
		this.unit = unit;
	}

	public double getTemperature() {
		return temperature;
	}

	public String getUnit() {
		return unit;
	}

	public abstract double changeUnit();

}
