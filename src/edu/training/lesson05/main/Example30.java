package edu.training.lesson05.main;

public class Example30 {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		int c = 5;
		
		if((a>b) && (b>c)) {
			a *= 2;
			b *= 2;
			c *= 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		System.out.println(a + "\n" + b + "\n" + c);
	}

}
