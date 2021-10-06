package test04;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntertainerApplicant me = new EntertainerApplicant("이도현", "19950608", "셰익스피어 - 십이야", "anne-marie");
		JypEntertainment jyp = new JypEntertainment();
		
		
		jyp.findOutSinger(me);
		jyp.findOutActor(me);
		

	}

}
