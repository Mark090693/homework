package by.yakovlev;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int max = 0;
        System.out.println("Введите максимальное число диапазона");
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int rnd = (int) (Math.random() * q);
        while (rnd != 0) {
            rnd =   (int) (Math.random() * q);
            if (max < rnd)
                max = rnd;
        }
        System.out.println("Максимально число из рандомных в диапазоне от 0 до " + q + " ровняется " + max);

    }

}