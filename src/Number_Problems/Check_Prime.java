package Number_Problems;

public class Check_Prime {

    public static void main(String[] args) {
        int num=4;

        if (checkPrimeorNot(num)){
            System.out.println(num+ " :is prime number");
        }else {
            System.out.println(num+ " :is Not prime number");
        }
    }

    static boolean checkPrimeorNot(int number){

        if (number <= 1){
            return false;
        }

        for (int i=2;i<number;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
