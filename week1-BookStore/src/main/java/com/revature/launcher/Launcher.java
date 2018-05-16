package com.revature.launcher;

import com.revature.prompts.MainMenuPrompt;
import com.revature.prompts.Prompt;

public class Launcher {

	public static void main(String[] args) {
		Prompt currentPromp = new MainMenuPrompt();
		while(true) {
			currentPromp = currentPromp.run();
		}
	}

}
