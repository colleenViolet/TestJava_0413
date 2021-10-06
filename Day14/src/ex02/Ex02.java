package ex02;

public class Ex02 {
	public static void main(String[] args) {
		
		PersonInfor kim = new PersonInfor("김수르", 22);
		PersonInfor jang = new PersonInfor("장인규", 23);
		System.out.println(kim);
		System.out.println(jang);
		
		if (kim.equals(jang)) {
			System.out.println("두사람은 같은 사람");
		}else {
			System.out.println("두사람은 다른 사람");
		}
	}
}
