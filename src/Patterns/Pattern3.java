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
        for (int i=2;i<=4;i++){
            for (int j=2;j<=i+1;j++){
                System.out.print(i*2);
            }
            System.out.println();
        }
    }
}
