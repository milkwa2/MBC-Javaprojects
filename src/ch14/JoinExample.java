package ch14;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		}catch (InterruptedException e) {}
		
		System.out.println("1~ 100 합 :" + sumThread.getSum() );

	}

}

class SumThread extends Thread{
	//필드
	private long sum; // 총합
	
	//생성자 생략...
	
	//getter, setter
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum= sum;
	}
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		
	}
	
}