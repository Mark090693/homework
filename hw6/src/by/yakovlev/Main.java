package by.yakovlev;

import javax.swing.*;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	int d = 31;
	int nd = d +1;
	int m = 12;
	int nm = 0;
	int y = 1999;
	int ny = 0;

	if (nd > 31) {
		m += 1;
		nd = 1;
		{
			if (m > 12) {
				nm += 1;
				ny = y + 1;
				System.out.println("Дата следующего дня " + nd + "." + nm + "." + ny);
			}
		}
	}
	else
		System.out.println("Дата следующего дня " + nd + "." + m + "." + y);

    }
}

