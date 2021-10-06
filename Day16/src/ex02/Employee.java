package ex02;

public class Employee implements JavaProgramming{
	//토익점수, 학점, 자격증
	
	private int toeic;
	private double grade;
	private String[] license;
	
	//지소서 쓰는 기능
	public String writeLetter() {
		String letter = "...";
		return letter;
	}
	
	@Override
	public void objectOriented() {
		System.out.println("저는 메가 스터디 IT에서 자바를 배워 ... ");
	}
	
}
