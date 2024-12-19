package Array_Problems;

public class SortArray {
    public static void main(String[] args) {

        int[] arr= new int[]{3,2,4,23,6,55,7,9,11};
        int[] sortedArray=sortArray(arr);

        for (int num: sortedArray){
            System.out.print(num+ " ");
        }
        System.out.println();
    }
    /*
    * int[] arr= new int[] {6,3,2,5,7,9,1};
    * */
    static int[] sortArray(int[] arr){

        for(int endIndex=arr.length-1; endIndex>=0; endIndex--){

            for(int i=0; i<endIndex; i++){
                if (arr[i]>arr[i+1]){
                    int temp= arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]= temp;
                }
            }
        }
        return arr;
    }
}
