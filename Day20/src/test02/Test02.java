package test02;

public class Test02 {
	
	public static void main(String[] args) {
		
		ThreadImpli ti1 = new ThreadImpli("¾îÈï");
		ThreadImpli ti2 = new ThreadImpli("À½¸Å~");
		ThreadImpli ti3 = new ThreadImpli("È÷À×");
		
		Thread thread1 = new Thread(ti1);
		Thread thread2 = new Thread(ti2);
		Thread thread3 = new Thread(ti3);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread3.start();
	}

}
