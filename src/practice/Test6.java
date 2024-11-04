package practice;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
        System.out.print(">");
        int i = scan.nextInt();
        
        if(i>0&i%2==0) {
        	System.out.println(i+"는 짝수입니다.");
        }
        	if(i>0&i%2==1) {
        
            	System.out.println(i+"는 홀수입니다.");}
        	if(i==0) {
            	System.out.println(i+"0 입니다.");}
        	if(i<0) {
        		System.out.println(i+"는 음수 입니다.");
        	
        	
        	
        }
        
	}
}