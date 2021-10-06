package ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) {
		
//		3
//		apple appel
//		sparkling sparkling
//		natural natural
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("src/ex02/ex02.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String readLine = br.readLine();
			int count = Integer.parseInt(readLine);
			
			int result = 0; 
			for(int i = 0; i < count; i++) {
				String text = br.readLine();
				
				String[] words = text.split(" ");
				if(words[0].equals(words[1])) {
					result ++;
				}
				
			}
			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
