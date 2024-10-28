package Number_Problems;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int N= 10;
        PrintFabonacciSeries(N);
    }

//    The Fibonacci sequence is given by 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 244 and so on

    static void PrintFabonacciSeries(int N){

        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series: " + num1 + ", " + num2);

        for (int i = 2; i < N; i++) {

            int nextTerm = num1 + num2;
            System.out.print(", "+ nextTerm);

            num1 = num2;
            num2 = nextTerm;
        }
    }
}
