package edu.training.lesson05.main;

public class Example31 {

	public static void main(String[] args) {

		double a = 10, b = 8;
		double x = 9, y = 9, z = 20;
		if (a > x) {
			if (b > y)
				System.out.println("Проидет.");
		}
		if (a > y) {
			if (b > x)
				System.out.println("Проидет.");
		}
		if (a > x) {
			if (b > z)
				System.out.println("Проидет.");
		}
		if (a > z) {
			if (b > x)
				System.out.println("Проидет.");
		}
		if (a > y) {
			if (b > z)
				System.out.println("Проидет.");
		}
		if (a > z) {
			if (b > y)
				System.out.println("Проидет.");
		} else {
			System.out.println("Не проидет.");
		}
	}

}
