package practice;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("키와 나이를 입력하세요.");
		System.out.print("키: ");
		double i = scan.nextDouble();
		System.out.print("나이: ");
		
		int f = scan.nextInt();
		
		System.out.println("=================");
		if(i>=140&&f>=8){System.out.println("놀이기구 탑승이 가능합니다");
		}else {System.out.println("널이기구 탑승이 불가능합니다");
		}
		
		
		
		
	}

}
