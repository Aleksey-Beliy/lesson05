package edu.training.lesson05.main;

import java.util.Scanner;

public class Example26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int sum = 0;
		int num1;
		int num2;

		System.out.println("Введите первое число");
		System.out.println(">");
		a = sc.nextInt();
		System.out.println("Введите второе число");
		System.out.println(">");
		b = sc.nextInt();
		System.out.println("Введите третье число");
		System.out.println(">");
		c = sc.nextInt();
		
		num1 = Math.min(a, Math.min(a, c));
		num2 = Math.max(a, Math.max(a, c));
		
		sum = num1 + num2;
		System.out.println("Сумма = " + sum);
	}

}
