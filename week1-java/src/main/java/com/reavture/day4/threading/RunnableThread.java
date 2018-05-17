package com.reavture.day4.threading;

public class RunnableThread implements Runnable {

	public void run() {
		System.out.println("I have started I am a RunnableThread");

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + ": I have looped " + i + " times");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
