package test02;

public class PhoneInformation {
	
	private String brand;
	private String modelName;
	private String modelCode;
	private String phoneNumber;
	
	public PhoneInformation(String brand, String modelName, String modelCode, String phoneNumber) {
		
		this.brand =brand;
		this.modelName =modelName;
		this.modelCode = modelCode;
		this.phoneNumber = phoneNumber;
		
	}
	
	public void callingSomeone() {
		System.out.println(this.getPhoneNumber() + "로 전화를 겁니다. 뚜르르르르....");
	}
	public void sendingSomeone() {
		System.out.println(this.getPhoneNumber() + "로 \"자니?\" 메세지를 전송합니다. ");
	}
	

	public String getBrand() {
		return brand;
	}
	public String getModelName() {
		return modelName;
	}
	public String getModelCode() {
		return modelCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

	
	
	
}
