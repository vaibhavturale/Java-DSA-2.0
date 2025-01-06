package Array_Problems;

import java.util.Arrays;

public class Find_SecondLargest {

    public static void main(String[] args) {
        int[] arr={5,6,3,2,8,7,9,11,40,33};
        sortArray(arr);
    }

    static void sortArray(int[] arr){

        int temp=0;
        for (int i= 0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }

        System.out.println("Second Largest Element: "+ arr[1]);
    }
}
