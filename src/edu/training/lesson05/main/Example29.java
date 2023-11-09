package edu.training.lesson05.main;

public class Example29 {

	public static void main(String[] args) {

		int x1 = 2;
		int y1 = 5;
		int x2 = 7;
		int y2 = 3;
		int x3 = 5;
		int y3 = 6;
		
		double a = (y2 - y1) * (x3 - x2);
		double b = (x2 - x1) * (y3 - y2);
		double c = (x3 - x2) * (y2 - y1);
		
		if(( a == b) && (b == c) && (a == c)) {
			System.out.println("Точки расположены на одной прямой");
		} else {
			System.out.println("Точки не расположены на одной прямой");
		}
	}

}
