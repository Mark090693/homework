package by.yakovlev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        if ((r - 1) % 10 ==0) {
            System.out.println(r + " рубль");
        } else if((r -2) % 10 == 0 || (r - 3) % 10 == 0 || (r - 4) % 10 == 0)
            {
                System.out.println(r + " рубля");
            }

            else
            {
                System.out.println(r + " рублей");
             }
    }
}

