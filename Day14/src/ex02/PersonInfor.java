package ex02;

public class PersonInfor {
	private String name;
	private int age;
	
	public PersonInfor(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		String result = this.name +" 은 " + this.age +" 살 입니다.";
		return result;
	}
	
	public boolean equals(Object obj) {
		PersonInfor person = (PersonInfor)obj;
		//이름이 같고 나이가 같으면 같은 사람으로 인식
		
		if(this.age == person.age && this.name.equals(person.name)) {
			return true;
		}
		return false;
	}
	
}
