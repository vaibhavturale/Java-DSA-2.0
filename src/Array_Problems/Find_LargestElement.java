package Array_Problems;

public class Find_LargestElement {
    public static void main(String[] args) {

        int[] arr= new int[]{3,2,4,23,6,55,7,9,11};
        int largeest= findLargest(arr);
        System.out.println(largeest);
    }

    static int findLargest(int[] arr){

//        int max=arr[0];
//        for (int i=0; i<arr.length; i++){
//            max=Math.max(max, arr[i]);
//        }
//        return max;
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        return max;
    }
}
