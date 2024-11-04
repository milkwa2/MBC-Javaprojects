package practice;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    
    
    System.out.print("정수를 입력하세요>");
    int i=scan.nextInt();
     System.out.println("입력받은수는 :"+(i%2==0?"짝수":"홀수"));
    
    
    
    
	}

}
