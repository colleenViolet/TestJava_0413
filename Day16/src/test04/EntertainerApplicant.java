package test04;

public class EntertainerApplicant implements Singaudition, Actaudition{
	
	private String name;
	private String birth;
	private String singAbility;
	private String actAbility;
	
	
	public EntertainerApplicant(String name, String birth, String actAbility, String singAbility) {
		this.birth = birth;
		this.name = name;
		this.actAbility = actAbility;
		this.singAbility = singAbility;
	}
	
	
	
	
	@Override
	public void actAbility() {
		System.out.println(actAbility);
	}
	
	@Override
	public void singAbility() {
		System.out.println(singAbility);
	}
//	
	
	

}
