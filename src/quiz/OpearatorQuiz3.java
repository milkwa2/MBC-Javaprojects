package quiz;

import java.util.Scanner;

public class OpearatorQuiz3 {

	public static void main(String[] args) {
		
         Scanner sc=new Scanner(System.in);
	      
	      System.out.print("첫번째 정수 입력 : ");
	      int num1 = sc.nextInt();
	      System.out.print("두번째 정수 입력 : ");
	      int num2 = sc.nextInt();
	      System.out.print("세번째 정수 입력 : ");
	      int num3 = sc.nextInt();
	      int plusResult = num1 + num2 +num3;
	      int minorResult = num1 - num2 ;
	      int multiResult = num1 * num2 ;
	      int divResult = num1 / num2 ;
	      System.out.println("더하기 결과 : "+plusResult);
	      System.out.println("빼기 결과 : "+minorResult);
	      System.out.println("곱하기 결과 : "+multiResult);
	      System.out.println("나누기 결과 : "+divResult);
          
	      sc.close();
	       	
	       
	       
	      
		
		
		
		

	}

}
