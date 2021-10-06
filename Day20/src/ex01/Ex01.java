package ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		String str = "string";
		int[] numbers = {1, 2};
		
		try {
			System.out.println(str.isEmpty());
			str.length();
			int number = numbers[3];
			foolish();
		}catch (Exception e) {
			System.out.println("예외가 생겼습니다. ");
			System.out.println( e);
		}
//		catch (NullPointerException e) {
//			System.out.println("null인 객체에 접근시도를 했습니다.");
//			
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열의 범위를 넘어갔습니다. ");
//		}
		
		
	}
	
	public static void foolish() throws Exception{
		throw new Exception();
		
	}
	
}
