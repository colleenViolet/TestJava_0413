package test02;

public class Test02 {
	public static void main(String[] args) {
		
		Temperature[] temperatures = new Temperature[2];
		temperatures[0] = new Celsius(26.3, "섭씨");
		temperatures[1] = new Fahrenheit(46.0, "화씨");
		
		for (int i = 0; i < temperatures.length; i++) {
			System.out.println(temperatures[i].getUnit() +"을 다른 단위로 바꾸면 " +temperatures[i].changeUnit() + "입니다.");
		}
		
		Length[] lengths = new Length[2];
		lengths[0] = new Centimeter(15.0, "센티미터");
		lengths[1] = new Inch(39.4, "인치");
		
		for (int i = 0; i < lengths.length; i++) {
			System.out.println(lengths[i].getUnit() + "를 다른 단위로 바꾸면 " + lengths[i].changeUnit() + "입니다.");
		}
		
	}

}
