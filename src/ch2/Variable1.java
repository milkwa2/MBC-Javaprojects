package ch2;

public class Variable1 {

	public static void main(String[] args) {
		// 변수=값 저장 
        //변수선언은
		//[데이터 타입] [변수명];
		//int age; // age라는 이름의 int 데이터 타입의 변수 선언.
		//age = 10;// age라는 변수에 10값을 대입합니다.
		int age;
		age = 100;
		System.out.println(age);   // sysout+ [ctrl+space] 자동완성
		System.out.println("입력된 나이는 : "+age); //변수값사용
	    double height = 179.8;
	    System.out.println("나의 키는 : "+height);
	    float weight = 103.4f; 
	    System.out.println("나의 몸무게는 : "+ weight);
	    
	    byte a = 100;
	    short b = -100;
	    char c = 1000;
	    char d = 'a'; //문자로 사용, ' ' 를 이용,0~65535 사이값
	    int e = -2147483648; //에러 
	    long f = 2147483648L;
	    
	    System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
	    
	    // boolean 타입 - 논리 (true, false)
	    System.out.println("boolean 처리 결과");
	    int x = 10;
	    boolean result = (x == 20); // 변수 x는 20입니까?
	    System.out.println("x == 20 : "+result);
	    result = (x != 20);         // 변수 x는 20이 아닙니까?
	    System.out.println("x != 20 : "+result);
	    result = (x>20);            // 변수 x는 20보다 큰가요/
	    System.out.println("x>20:"+result);
	    result = (0 < x && x < 20); //변수 x는 0보다크고 20보다 작나요?
	    System.out.println("0 < x && x < 20 : "+result);
	    result = (x < 0 || x > 200);//변수 x는 0보다 작거나,200보다큰가요?
	    System.out.println("x < 0 || x > 200 : "+result);
	}

}
