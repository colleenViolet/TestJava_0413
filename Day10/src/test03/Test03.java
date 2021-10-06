package test03;

public class Test03 {

	public static void main(String[] args) {
		
//		핸드폰 객체
//		핸드폰 Class 를 설계하세요.
//		멤버 변수는 아래를 참조 하세요.
//		제조사, 모델명, 전화 번호
//
//		설계된 Class 를 기반으로 두 개의 객체를 생성하여, 값을 저장 후, 출력하세요
//		멤버 변수에 저장 할 값은 자유롭게 작성하세요.
		
		CellPhoneDate[] dates = new CellPhoneDate[2];
		CellPhoneDate samsung = new CellPhoneDate();
		CellPhoneDate apple = new CellPhoneDate();
		
		dates[0] = samsung;
		dates[1] = apple ;
		
		dates[0].brand = "samsung";
		dates[0].phoneName ="갤럭시s10e";
		dates[0].phoneNumber = "01012345678";
		
		dates[1].brand = "apple";
		dates[1].phoneName ="iPhoneSE";
		dates[1].phoneNumber = "0109876543";
		
		for (int i = 0; i < dates.length; i++) {
			System.out.println(dates[i].brand);
			System.out.println(dates[i].phoneName);
			System.out.println(dates[i].phoneNumber);
		}
		
		System.out.println();
		
//		학생 Class를 설계하세요.
//		멤버 변수는 아래를 참조 하세요.
//		이름, 수업명, 나이, 전화번호
		
		
		StudentDate[] information = new StudentDate[2];
		StudentDate someone1 = new StudentDate();
		StudentDate someone2 = new StudentDate();
		
		information[0] = someone1;
		information[1] = someone2;
		
		information[0].name ="유재석";
		information[0].age = 21;
		information[0].subject ="java";
		information[0].phoneNumber ="01023453223";
		
		information[1].name ="이효리";
		information[1].age = 23;
		information[1].subject ="java";
		information[1].phoneNumber ="01096482734";
		
		for (int i = 0; i < information.length; i++) {
			System.out.println(information[i].name);
			System.out.println(information[i].age);
			System.out.println(information[i].subject);
			System.out.println(information[i].phoneNumber);
		}
		
		

	}

}
