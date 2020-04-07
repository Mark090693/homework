package by.yakovlev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        while (a != 0){
            b += a % 10;
            a = a / 10;
        }
        System.out.println("Сумма цифр числа ровняется: " +b);
    }
}
