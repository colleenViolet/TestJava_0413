package ex02;

public class ThreadImpli implements Runnable {
	
	private String code;
	
	public ThreadImpli(String code) {
		this.code = code;
	}


	@Override
	public void run() {
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


