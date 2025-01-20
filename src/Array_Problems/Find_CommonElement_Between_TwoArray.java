package Array_Problems;

public class Find_CommonElement_Between_TwoArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4,10,12,15};
        int[] arr2 = {5, 6, 17, 8,9};
        findCommonElement(arr1, arr2);

    }

    static void findCommonElement(int[] arr1, int[] arr2){
        boolean found= false;    // for NOT found

        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr2.length; j++){
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    found= true;
                }
            }
        }

        if (!found){
            System.out.println("No common elements found.");
        }
    }
}
