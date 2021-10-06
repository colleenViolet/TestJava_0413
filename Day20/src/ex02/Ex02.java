package ex02;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//멀티 Thread 만드는 방법
		
		//Thread 클래스 상속
		ThreadExtends thread1 = new ThreadExtends("***");
		ThreadExtends thread2 = new ThreadExtends("###");
//		thread1.run();
		
		//thread시작
		thread1.start();
		thread2.start();
		System.out.println("main thread");
		
		//thread1 이 종료 될때까지 대기 한다. 그뒤에 수행
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		ThreadImpli ti1 = new ThreadImpli("@@@");
		ThreadImpli ti2 = new ThreadImpli("&&&");
		//Runnable 인터 페이스를 사용 
		Thread thread3 = new Thread(ti1);
		Thread thread4 = new Thread(ti2);
		
		thread3.start();
		thread4.start();
		
		
	}

}
