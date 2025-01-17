package String_Problems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//import java.lang.*;
public class PrintVowels {

    public static void main(String[] args) {
        String str = "abedia";
        printVowelsbyStringBuffer(str);
        printVowels(str);
    }

    static void printVowelsbyStringBuffer(String str){
        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels.append(ch); // Append the vowel to the StringBuilder
            }
        }
        System.out.println("Print Vowels by StringBuffer:  "+vowels);
    }

//    ---------------------------------------------------------------

    static void printVowels(String s){

        Set<Character> vowels= new HashSet<>();
        for (int i=0; i<s.length(); i++){
            Character ch= s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                if(vowels.contains(ch)){
                    vowels.add(ch);
                }else{
                    vowels.add(ch);
                }
            }
        }
        System.out.println(vowels);

        Iterator itr= vowels.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }

}
