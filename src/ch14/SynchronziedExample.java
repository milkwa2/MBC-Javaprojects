package ch14;

public class SynchronziedExample {

	public static void main(String[] args) {
		// Calculator 객체 생성
		Calculator calculator = new Calculator(); // memory
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();

	}

}

class Calculator{
	// 필드 
	private int memory;
	
	public int getMemory() {
	return memory;
}
	
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+": " + this.memory);
	}
	// 메서드 선언부에 synchronized 사용!
		public synchronized void setMemory2(int memory) { // 동기화 메서드 설정
			//synchronized 블럭 생성
			synchronized (this) { // synchronized(공유객체){}
	this.memory = memory;
	try {
		Thread.sleep(2000);
	}catch (InterruptedException e) {}
	System.out.println(Thread.currentThread().getName()+": " + this.memory);
}
			}

}
class User1Thread extends Thread{
	//필드
	private Calculator calculator; 
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory1(100);
	
	}
	}

class User2Thread extends Thread{
	private Calculator calculator; 
	
	public User2Thread() {
		setName("User2Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
}
