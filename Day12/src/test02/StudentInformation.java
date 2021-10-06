package test02;

public class StudentInformation {
	
	private String name;
	private String university;
	private String phoneNumber;
	private String lesson;
	
	public StudentInformation (String name, String university, String phoneNumber, String lesson) {
		
		this.name = name;
		this.university = university;
		this.phoneNumber = phoneNumber;
		this.lesson = lesson;
		
		
	}
	
	public void getLessonInformation() {
		System.out.println(this.name + "에게 " + this.phoneNumber + " 수업일정 메세지를 전송합니다. ");
	}
	public void sendMessage(String message) {
		System.out.println(this.name + "에게 ( " + this.phoneNumber + " ) " + message +"라고 전송합니다. ");
	}
	

	public String getName() {
		return this.name;
	}
	public String getUniversity() {
		return this.university;
	}
	
	public void setUniversity(String university) {
		this.university = university;
		System.out.println(getName() + "님의  학교가 " + getUniversity() + "로 변경되었습니다.");
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getLesson() {
		return this.lesson;
	}
	

	
	
	
	
	
}
