package edu.training.lesson05.main;

import java.util.Scanner;

public class Example25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Введите темпепатуру");
		System.out.println(">");
		x = sc.nextInt();
		if(x > 60) {
			System.out.println("«Пожароопасная ситуация », температура в комнате превысила 60° С.");
		} else {
			System.out.println("Температура в норме");
		}
	}

}
