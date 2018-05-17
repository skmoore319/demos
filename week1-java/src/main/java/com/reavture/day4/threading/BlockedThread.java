package com.reavture.day4.threading;

public class BlockedThread implements Runnable {

	private BlockingUtil bu;

	public BlockedThread(BlockingUtil bu) {
		super();
		this.bu = bu;
	}

	public void run() {
		bu.blockingMethod();
	}

}
