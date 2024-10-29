package quiz;

import java.util.Scanner;

public class Coffeeprize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("커피 개수");
		int a = scan.nextInt();
		
		
		//a 는 커피개수
	 if (a >= 10)  { 
		 System.out.println ("총가격:"+ a*(1500));
	 }else if (a <10) {
			System.out.println("총가격:"+a*(2000));
		 
		 
			
	 }
	

			
		
	}

}
