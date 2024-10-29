package Patterns;

public class Pattern3 {

    public static void main(String[] args) {
        printPattern3();
    }

     /*     4 4
            6 6 6
            8 8 8 8

      */

    static void printPattern3(){
        int row=3;
        int startNumber=4;

        for (int i=1;i<=row;i++){

            for (int j=1;j<=i+1;j++){
                System.out.print(startNumber);
            }
            System.out.println();
            startNumber=startNumber+2;
        }
    }
}
