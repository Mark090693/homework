package by.yakovlev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		System.out.println("Введите длинну прямоугольника: ");
		Scanner scanner = new Scanner(System.in);
    	double a = scanner.nextInt();
		System.out.println("Введите ширину прямоугольника: ");
		Scanner scanner1 = new Scanner(System.in);
		double b = scanner1.nextInt();
		System.out.println("Введите радиус круга для проверки: ");
		Scanner scanner2 = new Scanner(System.in);
		int r = scanner2.nextInt();

		double a2 = Math.pow(a,2);
		double b2 = Math.pow(b,2);

		if (r >= (Math.sqrt(a2 + b2))/2)
			System.out.println("Картон с радиусом " + r + " полностью закроет отверстие!");
		else
			System.out.println("Картон с радиусом " + r + " не закроет отверстие!");





    }
}
