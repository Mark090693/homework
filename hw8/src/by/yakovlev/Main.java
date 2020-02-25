package by.yakovlev;

public class Main {

    public static void main(String[] args) {
	double fkt = 1;
	double proiz = 0;
	int x = (int)(Math.random()*10);
	while (x != 0) {
		System.out.println(x);
	    fkt = fkt * x;
	    x = (int)(Math.random()*10);
        }
	if(fkt != 0){
	    proiz = fkt;
    } else{
	    proiz = 0;
    }
        System.out.println("произведение: "+ proiz);
    }
}
