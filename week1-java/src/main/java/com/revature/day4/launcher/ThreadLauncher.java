package com.revature.day4.launcher;

public class ThreadLauncher {

	public static void main(String[] args) throws InterruptedException {

		// show the new and runnable states

		// Thread t = new ExtendedThread();
		// System.out.println(t.getState());
		// t.start();
		// Thread.sleep(1000);
		// System.out.println(t.getState());
		// System.out.println("here");

		// runnable threads
		// Thread t1 = new Thread(new RunnableThread());
		// t1.start();
		// Thread t2 = new Thread(new RunnableThread());
		// t2.start();
		//
		// Thread.sleep(1000);
		// System.out.println(Thread.currentThread().getName() + ":t1 is in the state
		// of: " + t1.getState());
		//
		// Thread.sleep(3000);
		// System.out.println(Thread.currentThread().getName() + ":t1 is now in the
		// state of: " + t1.getState());

		// block threads
		// BlockingUtil bu = new BlockingUtil();
		// Thread t1 = new Thread(new BlockedThread(bu));
		// Thread t2 = new Thread(new BlockedThread(bu));
		// t1.start();
		// t2.start();
		// Thread.sleep(1000);
		// System.out.println("t1 is in the state of: " + t1.getState());
		// System.out.println("t2 is in the state of: " + t2.getState());

		// waiting thread
		// Thread t = new Thread(new WaitingThread(Thread.currentThread()));
		// t.start();
		// Thread.sleep(1000);
		// System.out.println("t is in the state of " + t.getState());
		// Thread.sleep(1000);
		// System.out.println("done from main");

		Thread t = new Thread(() -> {
			while (true) {
				System.out.println("one looping");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t.start();
		
		Thread t2 = new Thread(() -> {
			while (true) {
				System.out.println("two looping");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t2.start();

	}

}
