package quiz;

import java.util.Scanner;   // 해당 코드에 스캐너를 객체를 import

public class OperatorQuiz1 {

   public static void main(String[] args) {
      //예제1) 두 수(정수)를 입력 받아서 더하기 연산을 하세요!!
      
      // Scanner 사용
      // 1 단계 : Scanner 객체 생성
      Scanner scan = new Scanner(System.in); 
 
      System.out.println("==========더하기 계산기==============");
      // 2 단계 : Scanner 사용 단계...
      System.out.print("정수 입력1 : ");
      int num1 = scan.nextInt();
      System.out.print("정수 입력2 : ");
      int num2 = scan.nextInt();
      
      // 더하기 계산 결과 출력
      int result = num1 + num2;
      System.out.println("더하기 계산 결과 : "+result);
      
      // 3 단계 : Scanner 객체 정리
      // scan.close();
      
      System.out.println("==========빼기 계산기==============");
      System.out.print("정수 입력1 : ");
      int num3 = scan.nextInt();
      System.out.print("정수 입력2 : ");
      int num4 = scan.nextInt();
      int result2 = num3 - num4 ;
      System.out.println("빼기 계산 결과 : "+result2);
       System.out.println("=========곱하기 계산기========");
       
      System.out.print("정수 입력1 : ");
      int num5 = scan.nextInt();
      System.out.print("정수 입력2 : ");
      int num6 = scan.nextInt();
      int result3 = num5 * num6 ;
      System.out.println("곱하기 계산 결과 : "+result3);
      
      System.out.println("=========나누기 계산기===========");
      System.out.print("정수 입력1 : ");
      int num7 = scan.nextInt();
      System.out.print("정수 입력2 : ");
      int num8 = scan.nextInt();
      int result4 = num7 / num8 ;
      System.out.println("나누기 계산 결과 : "+result4);
      
      System.out.println("======세정수 더하기 계산기======");
      System.out.print("정수 입력1 : ");
      int num9 = scan.nextInt();
      System.out.print("정수 입력2 : ");
      int num10 = scan.nextInt();
      System.out.print("정수 입력3 : ");
      int num11 = scan.nextInt();
      int result5 = num9 + num10 + num11 ;
      System.out.println("나누기 계산 결과 : "+result5);
      
      scan.close();
		

		
		
		
		
		
		
		
		
		
		

	}

}
