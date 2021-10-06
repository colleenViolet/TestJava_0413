package test01;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		
//		원
//		원 을 Class 로 설계하세요.
//		멤버 변수는 아래를 참조 하세요.
//		반지름
//
//		메소드는 아래 를 참조하세요
//		넓이 구하기, 둘레 구하기, 갯수에 따른 넓이 구하기
//
//		pi는 3.14
//
//		원 Class를 이용하여 반지름이 8인 원의 객체를 만들고, 아래 내용을 출력 하세요.
		Circle circle = new Circle();
		circle.count = 25;
		circle.radius = 8;
		
		System.out.println("원의 넓이는 " + circle.erea());
		System.out.println("원의 둘레는 " + circle.round());
		System.out.println("원의 갯수에 따른 넓이는 " + circle.countCircleErea());
		
		System.out.println();
//		제품 관리
//		제품 관리 Class를 설계 하세요.
//		제품 관리 Class 를 통해서 아래 내용을 출력 하세요.
		
		ManagementProduction snack = new ManagementProduction();
		
		snack.price = 1550;
		snack.productionName = "새우깡 ";
//		int[] dates = {2022, 03, 02};
		snack.expirationDate = "2022-03-02";
		
		System.out.println("이름 : " + snack.productionName);
		System.out.println("가격 : " + snack.price);
		System.out.println("유통기한은 " + snack.expirationDate);
		
		System.out.println("제품 5개의 가격은 "+ snack.countPrice(5));
		System.out.println("제품 13개의 가격은 "+ snack.countPrice(13));
		
		if (snack.availableSale("2021-05-11")) {
			System.out.println("판매 가능 상품");
		}else {
			System.out.println("판매 불가 상품");
		}
		
		
	}

}
