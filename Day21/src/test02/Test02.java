package test02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileInputStream fis = new FileInputStream("scr/test02/input2.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String readLine = br.readLine();
			int count = Integer.parseInt(readLine);
			
			for(int i = 0; i < count; i++ ) {
				String text = br.readLine();
				String[] test = text.split(" ");
				double result = Integer.parseInt(test[0]);
				for (int j = 0; j < test.length; j++) {
					if(test[j].equals("@")) {
						result *= 3;
					}else if (test[j].equals("%")) {
						result += 5;
					}else if(test[j].equals("#")) {
						result -= 7;
					}
					System.out.println(result);
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
