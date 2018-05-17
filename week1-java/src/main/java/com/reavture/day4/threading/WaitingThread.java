package com.reavture.day4.threading;

public class WaitingThread implements Runnable {

	private Thread threadToJoinWith;

	public WaitingThread(Thread threadToJoinWith) {
		super();
		this.threadToJoinWith = threadToJoinWith;
	}

	public void run() {
		System.out.println("now going to go to sleep");
		try {
			threadToJoinWith.join();
			System.out.println("main thread is now in the state of: " + threadToJoinWith.getState());
			System.out.println("resuming");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
