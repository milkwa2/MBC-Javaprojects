package ch4;

public class ForExample2 {

	public static void main(String[] args) {
		//  다중 for
		// 2중 for 문
		for (int i = 0; i <5; i ++)  { //상위 for 문
			for(int j = 0; j < 5; j++) { //하위 for 문
//				System.out.println("i 가 " +i+"이고, j 가 "+j+"인 경우 ");
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
		
		// 3중 for 문
		for (int i = 0; i < 10; i++) {
			System.out.println("==================================== 바깥쪽 반복문 : "+i);
			for (int j = 0 ; j <10; j++) {
				System.out.println("-----------------------------안쪽 반복문 "+i+"-"+j);
				for (int k = 0; k < 10; k++) {
					System.out.println("+++ 제일 안쪽 반복문 "+i+"-"+j+"-"+k);
				}
				
				
		        //예제1. 구구단을 출력해보자
				//2단-9단까지
				for(int dan= 2; dan<=9;  dan++) { //2 -9단
					System.out.println("====="+dan+"단 ====");
				    for (int gop = 1; gop <= 9; gop++)
					System.out.println(dan + "x"+gop+"="+(dan*gop));
				}
				
				//예제2.구구단 출력하기 2
				/*
				 *    2 x 1= 2     3 x 1 = 3
				 *    2 x 2= 4     3 x 2 = 6
				 *    2 x 3= 6     3 x 3 = 9
				 *    2 x 4= 8     3 x 4 = 9
				 *    ...
				 */
				 for (int gop = 1; gop <= 9; gop++)	 { //2 -9단
					 
					 for(int dan= 2; dan<=9;  dan++) {
				        System.out.printf("%d x %d = %d\t", dan, gop, dan*gop);
					 }
					 System.out.println();	
				    
				 }
    	  	  	     
				 // 초기화 식에서 부동 소수점을 쓰는 float 타입을 사용하지 않도록 주의
				 for(float x = 0.1f; x <= 1.0f; x+=0.1f) {
					 System.out.println(x);
				 }
  	  	    	       


				
				
				
				
				
				
				
				
			
			}
		}
	}
}
		
		
		
		
		
		
		
		
		
		

	


