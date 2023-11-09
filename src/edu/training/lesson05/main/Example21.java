package edu.training.lesson05.main;

import java.util.Scanner;

public class Example21 {

	public static void main(String[] args) {
		
		String x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Кто ты: мальчик или девочка?");
		
		x = sc.next();
		switch(x) {
		case "д":
			System.out.println("Мне нравятся девочки!");
			break;
		case"м":
			System.out.println("Мне нравтся мальчики!");
			break;
			default:
				System.out.println("Вы ввели неверное значение");
		}
	} 

}
