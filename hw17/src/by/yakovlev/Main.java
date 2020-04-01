package by.yakovlev;

public class Main {

    public static void main(String[] args) {
        int a[][] = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    a[i][j] = 1;
                }
                else if (i == 1) {
                    a[i][1] = 1;
                    a[i][2] = 1;
                    a[i][3] = 1;
                }
                else if (i == 2) {
                    a[i][2] = 1;
                }
                else if (i==3){
                    a[i][1]=1;
                    a[i][2]=1;
                    a[i][3]=1;
                }
                else if (i==4){
                    a[i][j] = 1;
                }
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
