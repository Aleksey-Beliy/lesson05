package edu.training.lesson05.main;

public class Main05 {

	public static void main(String[] args) {

		int a = 1;
		int b = 100;
		int sum = 0;
		while (a < b) {
			sum = sum + a;
			a = a + 2;
		}
		System.out.println("sum =" + sum);
	}

}
