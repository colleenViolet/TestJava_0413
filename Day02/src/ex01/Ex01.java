package ex01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noodleCup;
		int coke=1500;
		
		noodleCup= 850;
		coke = 1300;
		
		//육개장 3개의 가격
		
		int sum ;
		sum = noodleCup*3;
		System.out.println("육개장 3개의 가격은"+sum);
		
		int geldhaben=10000;
		
		geldhaben= geldhaben-sum;
		System.out.println("남은 나의 용돈은"+geldhaben);
		
		
		geldhaben =5000;
		System.out.println("살수있는 육개장의 갯수는"+(geldhaben/noodleCup));
		
		//나머지 연산자 %
		System.out.println("육개장을 사고 남은 잔돈은"+(geldhaben%noodleCup));
		
		
		
		
		

	}

}
