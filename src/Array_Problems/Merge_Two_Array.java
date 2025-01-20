package Array_Problems;

import java.util.Arrays;

public class Merge_Two_Array {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4,10};
        int[] arr2 = {5, 6, 7, 8,9};

        int arr1L= arr1.length;
        int arr2L= arr2.length;

        int[] mergedArray= new int[arr1L+arr2L];

        int index=0;
        for (int i=0; i< arr1.length; i++){
            mergedArray[index++]= arr1[i];
        }
        for (int j=0; j< arr2.length; j++){
            mergedArray[index++]= arr2[j];
        }

        for (int num: mergedArray){
            System.out.print(num+" ");
        }

        //ORR
        /*

        int arr1L= arr1.length;
        int arr2L= arr2.length;

        int[] arr3= new int[arr1L+arr2L];
        System.arraycopy(arr1, 0, arr3,0, arr1L);
        System.arraycopy(arr2, 0, arr3, arr1L, arr2L);

        System.out.println(Arrays.toString(arr3));

         */

    }
}
