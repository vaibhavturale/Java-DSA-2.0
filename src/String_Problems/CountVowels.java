package String_Problems;

import java.util.HashMap;
import java.util.Map;

public class CountVowels {

    public static void main(String[] args) {
        String s="Education";
        countVowels(s);
    }

    static void countVowels(String s){



        Map<Character, Integer> vowelsCount= new HashMap<>();

        for (int i=0; i<s.length();i++){
            Character ch= s.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                if (vowelsCount.containsKey(ch)){
                    vowelsCount.put(ch, vowelsCount.get(ch)+1);
                }else {
                    vowelsCount.put(ch, 1);
                }
            }
        }

        System.out.println("vowelsCount is: "+vowelsCount);
    }
}
