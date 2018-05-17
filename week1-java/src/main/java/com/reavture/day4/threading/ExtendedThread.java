package com.reavture.day4.threading;

public class ExtendedThread extends Thread {

	@Override
	public void run() {
		System.out.println("I am a thread");

		while (true) {
			// will just sort of run forever
		}
	}

}
