package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Set_Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int n1=sc.nextInt();
//        int n2=sc.nextInt();
        Set<Integer> set= new HashSet<>();

//        set.add(n1);
//        set.add(n2);

        set.add(100);
        set.add(null);
        set.add(14);
        set.add(100);

        Iterator itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
