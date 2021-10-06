package ex02;

public class ThreadExtends extends Thread {
	
	//구분용 코드
	private String code;
	
	public ThreadExtends(String code) {
		this.code = code;
	}
	
	@Override
	public void run() {
		//스레드로 수향할 코드 
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("hallo"+ this.code);
		}
	}
}
