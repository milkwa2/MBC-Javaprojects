package practice;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 두개를 입력하세요\n>");
		int a = scan.nextInt();
		System.out.print(">");
		int b = scan.nextInt();
		
		if (a>b) {System.out.println(a+"이 큰 수 입니다.");			
		}
		if(b>a) {System.out.println(b+"이 큰 수 입니다.");
	    }
		if(a == b ) {System.out.println("같은 수 입니다.");
		
		
		
	}
	}

}
