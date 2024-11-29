package ch14;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
//		Toolkit toolkit =Toolkit.getDefaultToolkit();
//		for(int i=0; i<5 ; i++) { // beep 소리 
//			toolkit.beep();
//			try {
//				Thread.sleep(500); // 1000 ->초
//			} catch (Exception e) {
//				}
			//스레드를 통해서 작업 진행...
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit =Toolkit.getDefaultToolkit();
				for(int i=0; i<5 ; i++) { // beep 소리 
					toolkit.beep();
					try {
						Thread.sleep(500); // 1000 ->초
					} catch (Exception e) {}
				}
				
			}
		});
		// 스레드 시작
		thread.start();
		
			for(int i=0; i<5; i++) {
				System.out.println("띵");
				try {
					Thread.sleep(500); // 1000-> 1s
				} catch (Exception e) {}
			}
		}
		
	}

