package day1.primitives;

public class Primitives {
	
	public static void main(String[] args) {
	
		boolean bool = true; // booleans can be true or false
		System.out.println("boolean = " + bool);
		
		byte b = 127; // bytes are one byte signed
		System.out.println("byte = " + b);
		
		short s = -50; // shorts are 2 bytes signed
		System.out.println("short = " + s);
		
		char c = 120; // chars are numbers of 2 bytes unsigned
		c = 'a';
		System.out.println("char = " + c);
		
		int i = 5200; // ints are 4 bytes
		System.out.println("int = " + i);
		
		long l = 239483209789l; // longs are 8 bytes
		System.out.println("long = " + l);
		
		float f = 52.25f; // floats are 4 bytes
		System.out.println("float = " + f);
		
		double dub = 52.25;
		System.out.println("double = " + dub);
	}

}
