package com.reavture.day5.singletons;

public class MySingleton {
	private static final MySingleton single = new MySingleton();

	private MySingleton() {
		super();
	}

	public synchronized void trace(String message) {
		// write message to txt file;
	}

	public static MySingleton getMySingleton() {
		return single;
	}

}
