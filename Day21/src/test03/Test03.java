package test03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03 {

	public static void main(String[] args) {
		
//		3   
//		hello  
//		eclipse  
//		programming
		
		try {
			FileInputStream fis = new FileInputStream("input3.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String readLine = br.readLine();
			int count = Integer.parseInt(readLine);
			
			for(int i = 0; i < count; i++ ) {
				String text = br.readLine();
				char[] test = text.toCharArray();
				
				char[] word = new char[text.length()];
//				for (int j = 0; j < word.length; j++) {
//					test[j] = word[word.length -(j + 1)];
//				}
//				
//				for (int j = 0; j < word.length; j++) {
//					System.out.println(word[j]);
//				}
//				System.out.println();
				
				for (int j = 0; j < word.length /2; j++) {
					//배열 길이에서 인덱스 뺀 값
					
					//0 4
					//1 3
					char tmp = word[j];
					word[j] = word[word.length -(j+1)];
					word[word.length - (j + 1)] = tmp;
					
				}
				for (int j = 0; j < word.length; j++) {
					System.out.println(word[j]);
				}
				System.out.println();
				
//				for (int j = test.length; j > 0; j--) {
//					System.out.print(test[j]);
//				}
//				System.out.println();
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
