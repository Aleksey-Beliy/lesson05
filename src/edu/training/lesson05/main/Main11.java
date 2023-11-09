package edu.training.lesson05.main;

public class Main11 {

	public static void main(String[] args) {

		long a = 200;
		long rezult = 0;

		for (long i = a; a >= 1;) {

			i = (long) Math.pow(a, 3);
			a--;
			rezult = i - rezult;

		}
		System.out.println(rezult);
	}
}
