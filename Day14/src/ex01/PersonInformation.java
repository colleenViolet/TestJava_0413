package ex01;

public class PersonInformation {
	
	protected String name;
	protected String birth;
	
//	public PersonInformation() {
//		System.out.println("개인정보");
//	}
	
	public PersonInformation (String name, String birth) {
		this.name = name;
		this.birth = birth;

	}
	
	public String getName() {
		return name;
	}
	
	public void greeting() {
		System.out.println("안녕하세요 저는 " + this.name +" 입니다. ");
	}

}
