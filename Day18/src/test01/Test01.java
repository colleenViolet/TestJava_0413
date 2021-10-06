package test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		products.add(new Product("새우깡", 1200, 150));
		products.add(new Product("육개장", 850, 30));
		products.add(new Product("신라면", 800, 15));
		products.add(new Product("천미표 팝콘", 1500, 0));
		
		System.out.println(products);
		
		Iterator<Product> iter = products.iterator();
		while (iter.hasNext()) {
			Product product = iter.next();
			if (product.getCount() == 0) {
				iter.remove();
			}
		}
		
		System.out.println(products);
		
		System.out.print("상품명 : ");
		String name = scan.next();
		System.out.print("개수 : ");
		int count = scan.nextInt();
		
		System.out.println();
		
		iter = products.iterator();
		while (iter.hasNext()) {
			Product product = iter.next();
			if(name.equals(product.getName())) {
				product.setCount(product.getCount() - count);
			}
		}
		
		System.out.println(products);
		
//		iter = products.iterator();
//		while (iter.hasNext()) {
//			Product product =  iter.next();
//			if(product.getCount() < 30) {
//				System.out.println(product);
//			}
//			
//		}
		
		for(Product product : products) {
			if(product.getCount() <30) {
				System.out.println(product);
			}
		}
		
		
		
	}

}
