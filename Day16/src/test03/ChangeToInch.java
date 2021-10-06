package test03;

public class ChangeToInch extends ChangeUnit {
	
//	public ChangeToInch(double unit, String unitName) {
//		super(unit, unitName);
//	}
	
	public ChangeToInch(String originUnit, String newUnit) {
		super(originUnit, newUnit);
	}

	@Override
	public String changeUnit (double input) {
		double result = input/2.54;
		return this.getOriginUnit() + " " + input + "을  " + this.getNewUnit() + "로 변환하면 " + result + "입니다. " ;
	}

}
