package Array_Problems;

public class Count_Occurrences {
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,3,5,7,8,9,0,8,8,8,8};
        int element=8;

       int count= countOccurences(arr, element);
        System.out.println(count);
    }

    static int countOccurences(int[] arr, int element){

        int count=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i] == element){
                count++;
            }
        }
        return count;
    }
}
