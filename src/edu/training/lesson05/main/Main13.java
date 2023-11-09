package edu.training.lesson05.main;

public class Main13 {

	public static void main(String[] args) {

		double x = -5;
		double y;

		while (x < 5) {

			y = 5 - Math.pow(x, 2) / 2;
			x += 0.5;

			System.out.println("y = " + y);
		}
	}

}
