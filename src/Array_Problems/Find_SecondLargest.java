package Array_Problems;

import java.util.Arrays;

public class Find_SecondLargest {

    public static void main(String[] args) {
        int[] arr= new int[]{1,2,4,23,22,12,5,7,9,25};
        int largest= findSecondLargest(arr);
        System.out.println(largest);
    }

    static int findSecondLargest(int[] arr){
        int n = arr.length;

        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
    }
}
