package day1.control;

public class FlowOfControl {
	public static void main(String[] args) {
		int i = 82;
		if(i == 24) {
			System.out.println("if I = 24 this will evaluate");
		} else if (i == 23) {
			System.out.println("else if I = 23 this will evaluate");
		} else {
			System.out.println("this will evaluate for all other values");
		}
		
		switch (i) {
		case 24:
			System.out.println("i = 24");
			break;
		case 82:
			System.out.println("i = 82");
			break;
		default:
			System.out.println("default, i didn't get caught by another case");
			break;
		}
		
		for(int j = 0; j < 4; j++) {
			System.out.println("I will say this 4 times: " + (j + 1));
		}
		
		while(i != 24) {
			System.out.println("while is looping indefinitely: " + i);
			i = (int) Math.floor(Math.random()*25);
		}
		System.out.println("i now = " + i);
		
		do {
			System.out.println("should only go once here because i should = 24");
		} while (i != 24);
		
	}
}
