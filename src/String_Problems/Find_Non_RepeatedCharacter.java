package String_Problems;

import java.util.HashMap;
import java.util.Map;

public class Find_Non_RepeatedCharacter {

    public static void main(String[] args) {

        String s="vvvddssrrll";
        find_Non_RepeatedCharacter(s);
    }

    static void find_Non_RepeatedCharacter(String s){

        Map<Character, Integer> countChar= new HashMap<>();
        for (int i=0; i<s.length(); i++){
            Character ch= s.charAt(i);
            if (ch != ' '){
                if (countChar.containsKey(ch)){
                    countChar.put(ch, countChar.get(ch)+1);
                } else if (ch>='a' && ch<='z') {
                    countChar.put(ch, 1);
                }
            }
        }
        System.out.println(countChar);
        for (Map.Entry<Character, Integer> me: countChar.entrySet()){
            if (me.getValue()==1){
                System.out.println(me.getKey()+"="+me.getValue());
            }
        }
    }
}
