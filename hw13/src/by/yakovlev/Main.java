package by.yakovlev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a < 0) {
                System.out.println("Отрицательное число не является возможным для проверки");
                continue;
            }
            else if (a == 0) {
                System.out.println("0 - не является числом для проверки");
                continue;
            }
            boolean sostavnoe = false;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    sostavnoe = true;
                    break;
                }
            }
            if (sostavnoe == true) {
                System.out.println("Введенное число - составное");
            }
            else {
                System.out.println("Введенное число - простое");
            }
        }
    }
}
