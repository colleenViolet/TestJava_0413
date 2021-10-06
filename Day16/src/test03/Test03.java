package test03;

public class Test03 {

	public static void main(String[] args) {
		
		ChangeUnit[] units = new ChangeUnit[2];
		units[0] = new ChangeToInch("cm", "inch");
		units[1] = new ChangetoFarhenheit("celsius", "fahrenheit");
		
		for (int i = 0; i < units.length; i++) {
			System.out.println(units[i].changeUnit(32.0));
		}

	}

}
