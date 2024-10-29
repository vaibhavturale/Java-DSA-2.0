package Array_Problems;

public class Find_Missing_Number {

    public static void main(String[] args) {
        int[] arr= new int[] {1,5,6,8,2,7,3,4,10};
        findMissingNum(arr);
    }

    static void findMissingNum(int[] arr){

        int n=10;
        int expectedSum= n * (n+1) /2;

        int actualSum=0;
        for(int num: arr){
            actualSum= actualSum+ num;
        }

        int missingNumber= expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
}
