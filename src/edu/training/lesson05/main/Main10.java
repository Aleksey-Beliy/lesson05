package edu.training.lesson05.main;

public class Main10 {

	public static void main(String[] args) {

		int a = 1;
		int rezult = 1;

		for (int i = a; a <= 200; i++) {
			rezult = rezult * i;
			a = (int) Math.pow(i, 2);
		}
		System.out.println(rezult);
	}
}
