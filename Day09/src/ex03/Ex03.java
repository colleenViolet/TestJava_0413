package ex03;

public class Ex03 {
	public static void main(String[] args) {
		
		//숫자 문자열
		String numberString = "30";
		String numberString1 = "20";
		
		System.out.println(numberString + numberString1);
		
		int number1 = Integer.parseInt(numberString1);
		int number2 = Integer.parseInt(numberString);
		
		System.out.println(number1 + number2);
		
		//숫자 => 문자열
		
		number1 = 5;
		number2 = 10;
		
		//꼼수지만 편해서 많이 쓰이는 친구
		numberString = number1 + "";
		numberString1 = number2 + "";
		
		System.out.println(numberString + numberString1);
		
		//정석적인 방법
		
		numberString = String.valueOf(number1);
		
		//문자열 비교
		String word1 = new String( "cat");
		String word2 = "cat";
		
		//문자열이 같을 까?
		
		if(word1 == word2) {
			System.out.println("두 문자열이 같다 ");
		}else {
			System.out.println("두문자열은 다르다. ");
		}
		
		// 문자열 비교 방법 
		if (word1.equals(word2)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		
	}

}
