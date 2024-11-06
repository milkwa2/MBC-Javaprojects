package ch8;

public class InterfacePolyEx1 {

	public static void main(String[] args) {
		// 자동차 객체 생성
		Car myCar = new Car();
		
		// run 메서드 실행
		myCar.run();
		
		// 타이어 교체
		myCar.tire1 = new Kumhotire();
		myCar.tire2 = new Kumhotire();

	}

}

interface Tire {
	//추상 메서드 
	void roll();
	
}

class HankookTire implements Tire{
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
		// TODO Auto-generated method stub
		
	}
}

class Kumhotire implements Tire{
	@Override
	public void roll() {System.out.println("금호 타이어가 굴러갑니다.");
		// TODO Auto-generated method stub
		
	}
}
class Car{
	//필드
	Tire tire1 = new HankookTire();
	Tire tire2 = new Kumhotire();
	
	//메소드
	void run() {
	tire1.roll();
	tire2.roll();
}

}
