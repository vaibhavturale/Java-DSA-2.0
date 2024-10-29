package String_Problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String s="heeello";
        findFrequency(s);
    }
    /*
    *  input: String s= "hello"
    *  output: h1 e1 l2 o1
    * */
    static void findFrequency(String s){

        Map<Character, Integer> charCount= new LinkedHashMap<>();

        for (int i=0;i<s.length();i++){
            Character ch= s.charAt(i);

            if (charCount.containsKey(ch)){
                charCount.put(ch, charCount.get(ch)+1);
            }else {
                charCount.put(ch, 1);
            }
        }
        System.out.println(charCount);

        //or

        for(Map.Entry<Character, Integer> entry: charCount.entrySet()){
            System.out.print(entry.getKey() +" "+ entry.getValue());
        }
    }
}
