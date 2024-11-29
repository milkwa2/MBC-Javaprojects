package ch14;

public class InterruptExample {

	public static void main(String[] args) {
		// 스레드 생성
		Thread thread = new printTread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		thread.interrupt(); // 일시 정지 상태의 스레드는  interruptException 발생

	}

}

class printTread2 extends Thread{
	 @Override
	public void run() {
//		try {
//			while(true) {
//				System.out.println("실행 중");
//				Thread.sleep(1); //일시 정지
//			}	
//		} catch (InterruptedException e) {
//			System.out.println("Interrupte발생");
//		}
		 
		 // 방법2
		 while(true) {
			 System.out.println("실행중....");
			 if(Thread.interrupted()) {
				 break;
			 }
		 }
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}