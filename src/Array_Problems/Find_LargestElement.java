package Array_Problems;

public class Find_LargestElement {
    public static void main(String[] args) {
        int[] arr={5,6,3,67,2,8,7,9,11,40,33};
        int largestElement= findLargestElement(arr);
        System.out.println(largestElement);
    }

    static int findLargestElement(int[] arr){
        int max=arr[0];
        for (int i=0; i< arr.length-1; i++){
            if (arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }

}
