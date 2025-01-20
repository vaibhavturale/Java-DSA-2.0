package Array_Problems;

public class SortArray {
    public static void main(String[] args) {

        int[] arr= new int[]{3,2,4,23,6,55,7,9,11};

        sortArrays(arr);
    }

    static void sortArrays(int[] arr){

        int temp= 0;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){             // arr[i] > arr[j] <-- For Ascending order
                    temp= arr[i];               // arr[i] < arr[j] <-- For Descending order
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }

        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
