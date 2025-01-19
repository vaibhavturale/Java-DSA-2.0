package String_Problems;

import java.util.Arrays;

public class Check_Anagrams {

    public static void main(String[] args) {
        String s1="vaibhav";
        String s2="vahbiav";

        if (checkAnagramn(s1,s2)){
            System.out.println(s1+" and "+s2+ " are Anagrams");
        }else {
            System.out.println(s1+" and "+s2+ " are Not Anagrams");
        }
    }

    static boolean checkAnagramn(String s1, String s2){

        if (s1.length() != s2.length()){
            return false;
        }
        char[] arr1= s1.toCharArray();
        char[] arr2= s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
