package test02;

public class Test02 {
	public static void main(String[] args) {
		
		SharpPencil sharpPencil = new SharpPencil(15, 0.25);
		sharpPencil.settingCondition();
		
		Ballpen ballPen = new Ballpen(20, "blue");
		ballPen.settingCondition();
		
		FountainPen fountainPen = new FountainPen(25, "green");
		fountainPen.settingCondition();
		
	}

}
