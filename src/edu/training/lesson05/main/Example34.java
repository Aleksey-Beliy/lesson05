package edu.training.lesson05.main;

import java.util.Scanner;

public class Example34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double money;
		double price;
		
		System.out.println("Введите стоимость книги");
		price = sc.nextDouble();
		
		System.out.println("Введите внесенную сумму");
		money = sc.nextDouble();
		
		if(money == price) {
			System.out.println("Спасибо");
		} else if(money < price) {
			double rezult1 = price - money;
			System.out.println("Внесите недостающую сумму " + rezult1);
		} else if(money > price) {
			double rezult2 = money - price;
			System.out.println("Возьмите сдачу " + rezult2);
		}
	}

}
