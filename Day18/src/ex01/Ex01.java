package ex01;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	
	public static void main(String[] args) {
		
		//Integer, String
		List<Member> members = new ArrayList<>();
		Member member = new Member("장예진", "010-4568-5908");
		members.add(member);
		members.add(new Member("유재석", "010-9874-5632"));
		members.add(new Member("이효리", "010-4789-5632"));
		members.add(new Member("조세호", "010-9874-2586"));
		
		System.out.println(members);
		
		Member me = members.get(0);
		System.out.println( me.getName());
		System.out.println( me.getPhoneNumber());
		
		//contains
		Member newMember = new Member("유재석", "010-9874-5632");
		if(members.contains(newMember)) {
			System.out.println("포함 되어 있습니다.");
		}else {
			System.out.println("포함 되어 있지 않습니다. ");
		}
		
	}

}
