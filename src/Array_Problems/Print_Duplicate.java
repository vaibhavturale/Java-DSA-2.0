package Array_Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Print_Duplicate {

    public static void main(String[] args) {
        int[] arr=new int[]{2,3,4,5,6,8,9,4,3};
        List<Integer> duplicate= findDuplicates(arr);
        System.out.println(duplicate);

        duplicate(arr);


    }

    static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> set= new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                duplicates.add(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        return duplicates;
    }

//    OR
    static void duplicate(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
