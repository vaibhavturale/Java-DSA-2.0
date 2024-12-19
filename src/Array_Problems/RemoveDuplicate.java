package Array_Problems;

import java.util.Arrays;
import java.util.*;


public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr=new int[]{2,1,4,8,11,2,8,7,11};

//        removeDuplicate(arr);
        Set<Integer> removeDuplicates= removeDuplicate(arr);
        System.out.println(removeDuplicates);
    }

    static Set<Integer> removeDuplicate(int[] arr){

        Set<Integer> removeDuplicate= new HashSet<>();
        List<Integer> addDuplicate= new ArrayList<>();

        for (int i=0; i<arr.length; i++){
            if (removeDuplicate.contains(arr[i])){
                addDuplicate.add(arr[i]);
            }else {
                removeDuplicate.add(arr[i]);
            }
        }
        return removeDuplicate;
    }
}
