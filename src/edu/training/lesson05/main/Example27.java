package edu.training.lesson05.main;

public class Example27 {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		int c = 7;
		int d = 3;
		int rezult;
		
		rezult = Math.max(Math.min(a, b), Math.min(c, d));
		System.out.println(rezult);
	}

}
