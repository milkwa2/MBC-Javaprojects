package ch3;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		// 3항 연산자
	    // 3개의 피연산자를 항을 통해서 결과를 출력하는 연산자
		// (조건식) ? (참인경우 동작 연산식) : (거짓인 경우 동작 연산식);
		
		int x = 10;
		//3항 연산식
		boolean result = (x == 10) ? true : false;
		System.out.println("x는 10인가요?" + result);
		
		//정수를 입력 받아 짝수이면 짝수를 출력, 홀수이면 홀수를 출력
		//하는 코드를 작성
		//입력은 Scanner를 사용해서 next Int()를 통해서 값을 전달 받습니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1=scan.nextInt();
		//x%2 == 1   //홀수
		//x%2 == 0   //짝수		
		String result2 = (num1 %2 == 1) ? "홀수" :"짝수";
		System.out.println("입력 값은 : " + result2);
		
		
		
        //정수 입력값이 3의배수 이면서 짝수이면 그값을 출력해 주세요

		
		System.out.print("정수 입력 : ");
		int num2=scan.nextInt();
		//x%2 == 1   //홀수
		//x%2 == 0   //짝수		
		int result3 = (num2 %2 == 0 && num2 %3 == 0) ?  num2 : 0;
		System.out.println("값: " +result3);
		
		scan.close();	
		
        	
         
        	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
