package by.yakovlev;

public class Main {

    public static void main(String[] args) {
	int a = 4;
	int b = 6;
	int c = 8;
	int d = 10;

	int ab = (a * b);
	int cd = (c * d);

	int e = 16;
	int f = 2;

	int ef = (e * f);

	if (ef > (ab + cd))
        System.out.println("Дома поместятся на участке");
	else
        System.out.println("Дома не поместятся на участке");


    }
}
