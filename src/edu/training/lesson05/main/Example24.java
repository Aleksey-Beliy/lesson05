package edu.training.lesson05.main;

import java.util.Scanner;

public class Example24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Введите число");
		System.out.println(">");
		n = sc.nextInt();
		if(n%2 == 0) {
			System.out.println("Любит");
		} else {
			System.out.println("Не любит");
		}
	}

}
