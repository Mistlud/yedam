package com.edu.thread;

import java.awt.Toolkit;

//class BeepTask implements Runnable {
//	@Override
//	public void run() {
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		toolkit.beep();
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//}

//프로세스 (메인스레드)
public class BeepPrintExample {
	public static void main(String[] args) {
		// Thread thread = new Thread(new BeepTask());
		
		// Thread 이름 = new Thread(() -> { 기능 });
		//익명구현객체 자체를 스레드클래스의 생성자 매개값으로 사용함
		// (() -> ~~~ });
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		thread.start();  // 스레드시작
		
		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("EoP");
	}
}
