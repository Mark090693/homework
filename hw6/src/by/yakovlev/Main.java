package by.yakovlev;

import javax.swing.*;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
		out.println("Введите день");
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int nd = d + 1;
		out.println("Введите месяц");
		Scanner scanner1 = new Scanner(System.in);
		int m = scanner1.nextInt();
		int nm = m + 1;
		out.println("Введите год");
		Scanner scanner2 = new Scanner(System.in);
		int y = scanner2.nextInt();
		int ny = y + 1;

		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
			if (d >= 1 && d < 31) {
				out.println("Дата следующего дня " + nd + "." + m + "." + y);
			} else if (d == 31) {
				d = 1;
				out.println("Дата следующего дня 0" + d + ".0" + nm + "." + y);
			} else {
				out.println("Такого числа не существует");
			}


		}

		else if (m == 4 || m == 6 || m == 9 || m == 11){
			if (d >= 1 && d <30){
				out.println("Дата следующего дня " + nd + "." + m + "." + y);
			}
			else if (d == 30 ){
				d = 1;
				out.println("Дата следующего дня 0" + d + "." + nm + "." + y);
			}
			else{
				out.println("Такого числа не существует");
			}

		}

		else if (m ==12 ){
			if ( d >= 1 && d < 31){
				out.println("Дата следующего дня " + nd + "." + m + "." + y);
			}
			else if (d == 31){
				d = 1;
				m = 1;
				out.println("Дата следующего дня 0" + d + ".0" + m + "." +ny);
			}
			else{
				out.println("Такого числа не существует");
			}
		}

		else if (m == 2){
			if (y % 400 == 0 || (y % 4 ==0 && y % 100 !=0)){
				if (d >= 1 && d < 29 ) {
					out.println("Дата следующего дня " + nd + "." + m + "." + y);
				}
				else if (d == 29 ) {
					d = 1;
					out.println("Дата следующего дня 0" + d + "." + nm + "." + y );
				}
				else {
					out.println("В феврале 28 или 29 дней");
				}
			}
			else {
				if(d >= 1 && d < 28){
					out.println(nd + "." + m + "." + y);
				}
				else if( d ==28 ){
					d = 1;
					out.println("Дата следующего дня 0" + d + "." + nm + "." + y);
				}
				else{
					out.println("Такого числа не существует");
				}
			}
		}
		else{
			out.println("Такого месяца не существует");
		}
	}

}

