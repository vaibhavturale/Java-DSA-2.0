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

        for (int num: arr){
            removeDuplicate.add(num);
        }
        return removeDuplicate;
    }
}
