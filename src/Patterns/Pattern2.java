package Patterns;

public class Pattern2 {

    public static void main(String[] args) {
        printPattern2();
    }

    /*
     *     * * * * *
     *     * * * *
     *     * * *
     *     * *
     *     *
     *
     * */

    static void printPattern2(){
        for (int i=1; i<=5; i++){

            for (int j=i; j<=5; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
