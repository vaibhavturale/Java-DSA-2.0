package Number_Problems;

public class Factorial {
    public static void main(String[] args) {
        int n=10;
        int factorialIs= findFactorial(n);
        System.out.println("Factorial of '"+n+"' is :"+factorialIs);
    }

    /**
     * Ex1:
     * input: n=3
     * output: 3 * 2* 1= 6
     *
     * Ex2:
     * input: n=4
     * output: 4 * 3 * 2* 1= 24
     */

    static int findFactorial(int n){

        int fact=1;
        for (int i=1;i<=n;i++){
            fact= fact * i;
        }
        return fact;
    }
}
