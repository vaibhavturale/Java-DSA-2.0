package Array_Problems;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
//        sortArray(arr);
    }
    /*
    * int[] arr= new int[] {6,3,2,5,7,9,1};
    * */
    static void sortArray(int[] arr){

        for (int lastIndex= arr.length; lastIndex > 0; lastIndex--) {
            int i= 0;
            int j= i+1;

            while (j< lastIndex) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j++;
                }
            }
        }
    }
}
