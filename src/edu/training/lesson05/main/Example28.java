package edu.training.lesson05.main;

public class Example28 {

	public static void main(String[] args) {

		int a = 4;
		int b = 5;
		int c = 7;
		int d = 8;

		if (a == d) {
			System.out.println("a = d");
		}else { if (b == d) {
				System.out.println("b = d");
		} else { if (c == d) {
					System.out.println("c = d");
				} else {
					a = d - a;
					b = d - b;
					c = d - c;
					int max = Math.max(a, Math.max(a, c));

					System.out.println(max);

				}
			}
		}
	}

}
