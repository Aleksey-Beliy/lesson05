package edu.training.lesson05.main;

import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n;
		double a = 1;
		double sum = 0;

		System.out.println("Введите число ");
		System.out.println(">");
		n = sc.nextInt();

		for (; a <= n; a++) {
			sum += 1 / a;
		}

		System.out.println(sum);

	}

}
