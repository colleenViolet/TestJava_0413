package ex01;

public class PersonInformation {
	//이름 생년월일 성별 저장
	
	private String name;
	private String birth;
	private String gender;
	
	public PersonInformation () {
		System.out.println("출생신고");
	}
	 public PersonInformation (String name, String birth, String gender) {
		this();
		
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		
		//값 유효성 검사
		if(gender.equals("남성") || gender.equals("여성")) {
			this.gender = gender;
		}else {
			System.out.println("성별을 잘 못 입력하였습니다.");
		}
	}
	 public String getName() {
		return "Ms." + this.name;
		
	}
	 public String getBirth() {
		 return this.birth;
		 
	 }
	 public String getGender() {
		 return this.gender;
		 
	 }
	 
	 public void setName(String name) {
		this.name = name;
	}

}
