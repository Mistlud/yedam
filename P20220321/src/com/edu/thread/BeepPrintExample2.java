package com.edu.thread;

import java.awt.Toolkit;

class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.beep();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class BeepPrintExample2 {
	public static void main(String[] args) {
		// Thread 이름 = new Thread(() -> { 기능 });
		Thread thread = new BeepThread();
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("EoPp");
	}

}
