package test03;

public abstract class ChangeUnit {
	
//	private double unit;
//	private String unitName;
//	
//	public ChangeUnit (double unit, String unitName) {
//		this.unit = unit;
//		this.unitName = unitName;
//	}
//
//	public double getUnit() {
//		return unit;
//	}
//
//	public String getUnitName() {
//		return unitName;
//	}
	private String originUnit;
	private String newUnit;
	
	public ChangeUnit(String originUnit, String newUnit) {
		this.originUnit = originUnit;
		this.newUnit = newUnit;
	}

	public String getOriginUnit() {
		return originUnit;
	}

	public String getNewUnit() {
		return newUnit;
	}

	public abstract String changeUnit(double input);

}
