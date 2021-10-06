package test02;

public class Test02 {
	public static void main(String[] args) {
//		학생 객체
//		학원에서 학생 관리를 위한 학생 Class 를 설계하세요.
//		생성자와 접근제어자를 이용해서 캡슐화 철학에 맞게 설계 하세요.
//		멤버 변수는 아래를 참조 하세요.
//		이름, 학교, 전화번호, 수업
//
//		설계된 Class 를 기반으로 두 개의 객체를 생성하여, 아래와 같이 출력하세요
//		멤버 변수에 저장 할 값은 자유롭게 작성하세요.
//		출력 내용에 맞춰서 적절히 기능을 구현하고 호출 하세요.
		
		StudentInformation lee = new StudentInformation("Lee do-gyeong", "dima", "01032705908", "java");
		
		System.out.println(lee.getLesson() + " 수업 : " + lee.getUniversity() + lee.getName() + "학생");
		lee.setUniversity("한양대학교");
		System.out.println(lee.getLesson() + " 수업 : " + lee.getUniversity() + lee.getName() + "학생");
		
		System.out.println();
	
		lee.sendMessage();
		lee.getLessonInformation();
		
		
//		갤럭시s10 Class 를 설계하세요.
//		생성자와 접근제어자를 이용해서 캡슐화 철학에 맞게 설계 하세요.
//		멤버 변수는 아래를 참조 하세요.
//		제조사, 모델명, 일련번호, 전화번호
//
//		설계된 Class 를 기반으로 객체를 생성하여, 아래와 같이 출력하세요
//		멤버 변수에 저장 할 값은 자유롭게 작성하세요.
//		출력 내용에 맞춰서 적절히 기능을 구현하고 호출 하세요.
		System.out.println();
		
		PhoneInformation gallaxy10  = new PhoneInformation("삼성", " Gallaxy10 ", "1234567890", "010-111-2222");
		
		System.out.println(gallaxy10.getBrand() + "에서 제조된 " + gallaxy10.getModelName() + "입니다.");
		System.out.println("전화 번호 : " + gallaxy10.getPhoneNumber());
		System.out.println("일련 번호 : " + gallaxy10.getModelCode());
		
		System.out.println();
		
		gallaxy10.setPhoneNumber("010-1234-5678");
		gallaxy10.callingSomeone();
		gallaxy10.setPhoneNumber("010-9876-5432");
		gallaxy10.sendingSomeone();
		
	}

}
