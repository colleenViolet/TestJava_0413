package ex01;

public class Member {
	
	//회원 이름, 전화번호
	private String name;
	private String phoneNumber;
	
	public Member(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return"이름 " + this.name +  "  전화번호 : " + this.phoneNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		Member member = (Member)obj;
		if(this.name.equals(member.name) &&
				this.phoneNumber.equals(member.phoneNumber)) {
			return true;
		}else {
			return false;
		}
	}
	
}
