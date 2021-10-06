package ex01;

public class StudentInformation extends PersonInformation {
	
	private String school;
	
//	public StudentInformation() {
//		System.out.println("학생정보");
//	}
	
	public StudentInformation (String name, String birth, String school) {
		super(name, birth);
		this.school = school;
	}
	
	//매소드 재정의 
	@Override
	public void greeting() {
		System.out.println("안녕하세요. 저는 " + this.school + "재학생 " + this.getName() + "입니다.");
	}
	
	//부모매소드 보다 자식 매소드가 더 위다. 
	// 집합으로 보면 자식 클래스가 부모클래스를 포함하는형상이라고 생각 하면 된다. 
	
	public String getSchool() {
		return this.school;
	}
	
}
