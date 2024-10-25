package String_Problems;

import java.util.Scanner;

public class Revese_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String reverse= reverseString(s);
        System.out.println(reverse);

    }
    //S= "ABCDEF";
    static String reverseString(String s){

        String newStr="";

        for (int i=s.length()-1;i>=0;i--){
            newStr=newStr+ s.charAt(i);
        }
        return newStr;
    }
}
