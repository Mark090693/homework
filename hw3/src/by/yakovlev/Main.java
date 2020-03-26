package by.yakovlev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		System.out.println("Введите число");
    	Scanner	scanner = new Scanner(System.in);
    	int x = scanner.nextInt();
		int a;
		a = (x % 10);
		if (a == 7 )
			System.out.println("Последнее число является числом 7 ");
		else
			System.out.println("Последнее число не является числом 7 ");
		}
}
