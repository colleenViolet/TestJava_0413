package test01;

public class Test01 {
	
	public static void main(String[] args) {
		
		IPodTouch ipodTouch = new IPodTouch();
		ipodTouch.infoString();
		
		IPhone iPhone = new IPhone("01012345678");
		iPhone.infoString();
		iPhone.tellPhoneNumber();
		iPhone.internetBrowsing("https://www.google.com");
		
		iPhone.callingSomeone("010-0000-1111");
		iPhone.sendingMessage("せせせせせ", "010-1111-2222");
		
		
		
	}

}
