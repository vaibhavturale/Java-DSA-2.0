package String_Problems;

import java.util.HashSet;
import java.util.Set;

public class Count_Vowels_and_Consonants {

    public static void main(String[] args) {
        String s= "abcdefghijklmnopqrstuvwxyz abc 123";
        int countVowels= 0;
        int countConsonents= 0;

        for (int i=0; i<s.length(); i++){
            Character ch= s.charAt(i);
            if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                countVowels++;
            }else if(ch>='a' && ch<='z'){
                countConsonents++;
            }
        }
        System.out.println("Length is: "+ s.length());
        System.out.println("Vowels Count is: "+ countVowels);
        System.out.println("Vowels Consonent is: "+ countConsonents);
    }
//    OUTPUT
//    Length is: 34
//    Vowels Count is: 6
//    Vowels Consonent is: 23

}
