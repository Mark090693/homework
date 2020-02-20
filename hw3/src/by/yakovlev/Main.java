package by.yakovlev;

public class Main {

    public static void main(String[] args) {
	int x = 345687;
	int a;
	a = (x % 10);
	if (a == 7 )
		System.out.println("Последнее число является числом 7 ");
	else
		System.out.println("Последнее число не является числом 7 ");
    }
}
