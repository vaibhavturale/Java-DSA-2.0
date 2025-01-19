package CollectionFramework.List;

import java.util.*;

public class List_Main {

    public static void main(String[] args) {

        int[] arr={3,2,5,1,7,8,9,14,11,12};

        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(100);

//        for (int num: list){
//            System.out.println(num);
//        }

//        for (int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }

        ListIterator itr= list.listIterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
