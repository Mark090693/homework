package by.yakovlev;

public class Main {

    public static void main(String[] args) {
	double a = 50;
	double b = 8;
	double r = 5;

	double c2 = ((Math.pow((0.5 * a), 2)) + (Math.pow((0.5 * b), 2)));
	double c = double.sqrt (double c2);
// Вот так оно точно должно работать правильно
// Но видимо нужно как то либо математику импортнуть ли бо еще что то



	if (r >= c)
        System.out.println("Круглая фигура не покроет прямоугольную дырку");
	else
        System.out.println("Круглая фигура покроет прямоугольную дырку");
    }
}
