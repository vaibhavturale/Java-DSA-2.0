package Patterns;

public class Pattern4 {

    public static void main(String[] args) {
        printPattern4();
    }
    /*      1 2 3 4 5 * * * * *
            11 12 13 14 15 * * * * *
            21 22 23 24 25 * * * * *
            ....
            91 92 93 94 95 * * * * *
     */

    static void printPattern4(){
        int rows=10;
        int column=10;

        for (int i=0; i<rows; i++){

            for (int j=1;j<=5;j++){
                System.out.print((i*10+j)+" ");
            }

            for (int k = 0; k < 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
