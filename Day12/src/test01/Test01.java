package test01;

public class Test01 {
	public static void main(String[] args) {
		
		PersonInformation kim = new PersonInformation();
		kim.name = "김수르";
		kim.birth ="19990426";
		kim.gender="남자 ";
		
		System.out.println("이름: " + kim.name);
		System.out.println("생년월일: " + kim.birth);
		System.out.println("성별: " + kim.gender);
		
		kim.greetig(2021);
		
		PersonInformation yu = new PersonInformation();
		
		yu.name = "유재석";
		yu.birth = "19981104";
		yu.gender = "남자";
	
		System.out.println("김수르는 유재석 보다 " + (yu.getAge(2021) - kim.getAge(2021)) + "살 차이 난다. ");
		
		kim.compareAge(yu);
		
	}
}
