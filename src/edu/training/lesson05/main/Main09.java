package edu.training.lesson05.main;

public class Main09 {

	public static void main(String[] args) {

		int a = 1;
		int sum = 0;

		for (int i = a; a < 101;) {
			sum = sum + i;
			a++;
			i = (int) Math.pow(a, 2);
		}
		System.out.println(sum);
	}

}
