package test03;

public class Test03 {
	public static void main(String[] args) {
		
//		원 을 Class 로 설계하세요.
//		학원에서 학생 관리를 위한 학생 Class 를 설계하세요.
//		생성자와 접근제어자를 이용해서 캡슐화 철학에 맞게 설계 하세요.
//		멤버 변수는 아래를 참조 하세요.
//		반지름
//		메소드는 아래 를 참조하세요
//		넓이 구하기, 둘레 구하기, 갯수에 따른 넓이 구하기
//		pi는 3.14
//
//		원 Class를 이용하여 반지름이 8인 원의 객체를 만들고, 아래 내용을 출력 하세요.
		
		Circle circle = new Circle();
		circle.radius = 3;
		int count = 8;

		System.out.println("원 " + count + " 개의 넓이는 " + circle.countDimensions(count));
		System.out.println("원의 둘레는 " + circle.round());
		System.out.println("원의 넓이는 " + circle.getDimensions());
		
		System.out.println();
		
//		제품 관리 Class를 설계 하세요.
//		학원에서 학생 관리를 위한 학생 Class 를 설계하세요.
//		생성자와 접근제어자를 이용해서 캡슐화 철학에 맞게 설계 하세요.
//		제품 관리 Class 를 통해서 아래 내용을 출력 하세요.
//		유통기한을 이 지나지 않았을 경우 "판매 가능상품", 유통기한이 지났을 경우 "판매 불가 상품"
		
		ManagementProduction shrimpSnack = new ManagementProduction("새우깡", 1300, "2021-03-02");
		
		System.out.println("이름: " + shrimpSnack.getName());
		System.out.println("가격 : " + shrimpSnack.getPrice());
		System.out.println("유통기한 : " + shrimpSnack.getExpirationDate());
		
		System.out.println("제품 5개의 가격 : " + shrimpSnack.getPrice(5) + "원입니다.");
		System.out.println("제품 13개의 가격 : " + shrimpSnack.getPrice(13) + "원입니다.");
		
		if (shrimpSnack.availableSale("2021-05-11")) {
			System.out.println("판매 가능 상품");
		}else {
			System.out.println("판매 불가 상품");
		}
		
		
		
	}

}
