package com.reavture.day4.threading;

public class BlockingUtil {

	public synchronized void blockingMethod() {
		System.out.println(Thread.currentThread().getName() + ": started blockingMethod");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": finished blockingMethod");

	}

}
