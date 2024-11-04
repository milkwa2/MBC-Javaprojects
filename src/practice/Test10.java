package practice;


import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("수를 입력하세요");
		System.out.print(">");
		int number=scan.nextInt();
		int[]arry=new int[number];
		
		for(int i = 0; i<arry.length;i++) {
			
			arry[i] = scan.nextInt();
	    
		}
        for(int i = 0; i<arry.length;i++) {
			
			
	System.out.println(arry[number]);
		
	}

}
}
