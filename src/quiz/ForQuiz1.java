package quiz;

public class ForQuiz1 {

	public static void main(String[] args) {
		// quiz1. 1 ~ 200 사이의 숫자 중에서 (2 또는 3의 배수 )가 아닌 수 들의 총 합을 구하세요
		int sum = 0;
		for (int j = 1; j <=200; j++) {
			if(j%2 != 0 && j%3 !=0) {
				sum+=j;
				
			}
		}
				System.out.println("1~200사이중 2또는 3의배수가 아닌수들의 총합 :" + sum);
	//	System.out.println("1부터 200까지 2또는 3의 배수가아닌 수들의 합 : "+sum);
		
	//	for (int num = \u0065; num < \u0090; i++)
	//	int num = (int)(Math.random() * 50) + 1;
	
			
	//	 System.out.println(num);
		
		//num=1의 기본값을 u0065로 만들어야함
		 //거기에다가 ++로 증감시켜야함
				
		
		
		
		//Quiz2.class 랜덤 알파벳 대문자 50개를 생성해서 출력하는 프로그램을 만들어 보세요.
		//10줄마다 줄바꿈도 실행해야 합니다.
		//출력 예 > DFDQWAZCXV
		//        SADFSGWQVC
		//        ....
		// 1. 사용하는 함수(메서드) Math.random()을 활용해서 작업합니다.
		// 2. char 자료의 특징을 생각해서 작업을 진행합니다.
		//  -정수 자료
		//  -1글자 출력. (ASCII 코드 참조)
		
		char a = 'A';
		int b = 66;
		System.out.printf("a의 코드 값 : %d ",(int)a);
		System.out.printf("b의 코드 값으로 출력 : %c",(char)b);
		
		//Math.random() -> 0.0 ~ 1.0 실수 값들
		//(int)(Math.random() * 10) + 10 -> 0+10 ~9 + 10
		int ran = (int)(Math.random()*10); // 0 ~ 9(10개)
		ran = (int)(Math.random()*26);      //0 ~ 25(26개)
		ran = (int)(Math.random()*26) + 65; //65~90(26개)
		
		//영문자(대) -> 50개 생성...
		for(int i = 0; i< 50; i++) {
			char ch = (char)+((int)(Math.random()*26)+65);
			System.out.printf("%c",(char)ch);
			if ( i % 10 == 9 )System.out.println();
		}
		
		
		
		
		}
		
		

	}


