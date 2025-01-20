package Number_Problems;

public class Armstrong_Number {

    public static void main(String[] args) {
        int num= 371;
        if (checkAmstrongNumber(num)){
            System.out.println(num+ ": is a Amstrong Number");
        }else {
            System.out.println(num+ ": is a Amstrong NOT Number");
        }
    }

//    An Armstrong number is a number where the sum of its digits
//    raised to the power of the number of digits equals the original number

    static boolean checkAmstrongNumber(int num){
        int originalNumber= num;
        int sum=0;
        
        while (num > 0){
            int digit= num%10;
            sum= sum+(digit*digit*digit);
            num=num/10;
        }
        return sum == originalNumber;
    }
}
