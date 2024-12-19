package Array_Problems;

public class Find_LargestElement {
    public static void main(String[] args) {

        int[] arr={5,6,3,2,8,7,9,11,40,33};
        sortArray(arr);
        findSecondHighest(arr);
    }

    static void sortArray(int[] arr){

        for (int endIndex= arr.length-1; endIndex>=0; endIndex--){
            for (int i=0; i<endIndex; i++){
                if (arr[i] > arr[i+1]){
                    int temp= arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]= temp;
                }
            }
        }
    }
    static void findSecondHighest(int[] arr){
        System.out.println("Second Largest Element: "+ arr[arr.length-2]);
    }

}
