package edu.training.lesson05.main;

import java.util.Scanner;

public class Example23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int day;
		int month;

		System.out.println("Введите число");
		System.out.println(">");
		day = sc.nextInt();
		if ((day < 1) || (day > 31)) {
			System.out.println("Вы ввели неккоректные даные");
		}
		
		System.out.println("Введите месяц");
		System.out.println(">");
		month = sc.nextInt();
		if ((month > 12) || (month < 1)) {
			System.out.println("Вы ввели неккоректные даные");
		}
	}

}
