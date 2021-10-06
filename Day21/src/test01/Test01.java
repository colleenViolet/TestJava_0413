package test01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {
	
	public static void main(String[] args) {
//		2
//		12 5
//		9 -13
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("src/test01/test01.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String readLine = br.readLine();
			int count = Integer.parseInt(readLine);
			
			for(int i = 0; i < count; i ++) {
				String text = br.readLine();
				String[] trennen = text.split(" ");
				int[] result = new int[2];
				for (int j = 0; j < trennen.length; j++) {
					if(Integer.parseInt(trennen[j]) < 0) {
						result[j] = 1;
					}
				}
				if(result[0] == 0 && result[1] == 0) {
					System.out.println("1사분면");
				}else if(result[0] == 0 && result[1] == 1) {
					System.out.println("4사분면");
				}else if (result[0] == 1 && result[1] == 0) {
					System.out.println("2사분면");
				}else if(result[0] == 1 && result[1] == 1){
					System.out.println("3사분면");
				}
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
