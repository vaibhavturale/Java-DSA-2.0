package Number_Problems;

import java.util.Scanner;

public class Print_Prime_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a starting number");
        int n1=sc.nextInt();
        System.out.println("Enter a ending number");
        int n2=sc.nextInt();

        for (int i=n1; i<=n2; i++){
            if(printPrimeNumbers(i)){
                System.out.println(i);
            }
        }
    }

    static boolean printPrimeNumbers(int num){
        if (num<=1){
            return false;
        }
        for (int i=2; i<num; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
