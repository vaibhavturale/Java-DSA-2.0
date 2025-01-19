package CollectionFramework.Map;

import java.util.*;

public class Map_Main {

    public static void main(String[] args) {
        Map<Integer,  String> map =new HashMap<>();
        Scanner sc= new Scanner(System.in);

        map.put(1, "alpha");
        map.put(2, "beta");
        map.put(3, "beta2");
        map.put(null, "beta31");

        System.out.println(map);

//        -- One way to iterate---
        System.out.println("One way to iterate: ");
        for (Map.Entry<Integer, String> me: map.entrySet()){
            System.out.println(me.getKey()+" "+me.getValue());
        }
//        -- Onother way to iterate---

        System.out.println("Onother way to iterate: ");
        Set set= map.entrySet();

        Iterator itr= set.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
