package edu.training.lesson05.main;

public class Example22 {

	public static void main(String[] args) {

		int x = 5;
		int y = 4;
		int temp;
		
		temp = x;
		x = Math.max(x, y);
		y = Math.min(temp, y);
		System.out.println("x = " + x + "\n" + "y = " + y);
	
	}

}
