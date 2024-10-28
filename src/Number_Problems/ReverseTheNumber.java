package Number_Problems;

public class ReverseTheNumber {

    public static void main(String[] args) {
        int n=11211;
        int reversedNum= revNum(n);
        if (n==reversedNum){
            System.out.println(reversedNum +" :is Palindrome");
        }else{
            System.out.println(reversedNum +" :is NOT Palindrome");
        }

    }
    /*
    *  input: num = 12345
    *  output: num= 54321
    * */

    static int revNum(int n){
        int newNum=0;
        while (n >0) {
            int digit = n % 10;
            newNum = (newNum*10) + digit;
            n = n / 10;
        }
        return newNum;
    }
}
