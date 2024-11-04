package practice;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("구입할 메뉴는?");
		System.out.println("[수박,사과,멜론,포도,귤]");	
		System.out.println(">");
		String fruit =scan.next();
		
		switch (fruit) {
		case "수박": System.out.println("수박의 가격은 2만원입니다.");
	             break;
		case "귤": System.out.println("귤의 가격은 6만원입니다.");
		         break;
		         default:
		        	 System.out.println(fruit+"는 메뉴에 없습니다.");
		        	 System.out.println("다시 입력해주세요.");
		}

	}

}
