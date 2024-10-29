package Patterns;

public class printPattern5 {

    public static void main(String[] args) {

        printPattern5();
    }

    /**
     *   10 * 8 *
     *   6 * 4
     *   * 2
     *   *
     *
     */

    static void printPattern5(){

        int row=4;
        int column=4;
        int num=10;

        for (int i=1; i<=row; i++){
            int k=1;
            for (int j=10; k<=column; j--){
                if(num%2 != 0){
                    System.out.print("*");
                }else {
                    System.out.print(num);
                }
                k++;
                num--;
            }
            column--;
            System.out.println();
        }
    }
}
