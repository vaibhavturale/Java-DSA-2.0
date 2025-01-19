package String_Problems;

import java.util.HashMap;
import java.util.Map;

public class Find_Maximum_Occurence_Character {

    public static void main(String[] args) {
        String str= "abcdefacddfdff";
        find_Maximum_Occurence(str);
    }
    static void find_Maximum_Occurence(String s){
        String str= s.toLowerCase();
        Map<Character, Integer> map= new HashMap<>();

        for (int i=0; i< str.length(); i++){
            Character ch= str.charAt(i);
            if (ch != ' '){
                if (map.containsKey(ch)){
                    map.put(ch, map.get(ch)+1);
                }else if(ch>='a' && ch<='z'){
                    map.put(ch, 1);
                }
            }
        }
        System.out.println(map);
        // Find the maximum frequency
        int maxCount = 0;
        for (int count : map.values()) {      //map.values() --> [2, 1, 2, 4, 1, 1]
            if (count > maxCount) {
                maxCount = count;
            }
        }
        // Find all characters with the maximum frequency
        System.out.println("Characters with the maximum frequency:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}
