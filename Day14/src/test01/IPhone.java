package test01;

public class IPhone extends IPodTouch {
	// 모델 이름과 핸드폰 번호 변경 또는 새로 입력 
	// 부모 클래스를 그대로 사용 가능 하기때문에 그대로 사용한다. 
	// 메세지 전송과 전화중 기능만 추가 하면 된다. 
	

	private String phoneNumber;
	
	public IPhone (String phoneNumber) {
		
		this.setModel("IPhone");
		this.phoneNumber = phoneNumber;
		
	}
	
	 public void sendingMessage(String message, String number) {
        System.out.println(number + "로 " + message + "전송중");
    }
	 
	 public void callingSomeone (String number) {
		 System.out.println(number + "로 통화중");
	 }
	 
	public void tellPhoneNumber() {
		System.out.println("전화번호 : " + this.phoneNumber);
	}
	
	
	
	

}
