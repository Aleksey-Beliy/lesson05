package edu.training.lesson05.main;

import java.util.Scanner;

public class Example33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите пароль");

		int password = sc.nextInt();

		switch (password) {

		case 9583:
		case 1747:
			System.out.println("Доступны модули баз A, B, C");
			break;

		case 3331:
		case 7922:
			System.out.println("Доступны модули баз B, C");
			break;

		case 9455:
		case 8997:
			System.out.println("Доступны модули баз C");
			break;
		default:
			System.out.println("Неверный пароль");

		}

	}

}
