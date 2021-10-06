package test02;

public class ThreadImpli implements Runnable {
	
	private String AnimalCrySound;
	
	public ThreadImpli(String AnimalCrySound) {
		this.AnimalCrySound = AnimalCrySound;
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 5; i ++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.AnimalCrySound);
		}

	}

}
