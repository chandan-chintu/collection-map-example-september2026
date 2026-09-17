package collection.examples.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        //declaring list
        List<Integer> list1 = new LinkedList<>(); //{10,-12,0,null,23,39,-33}

        //add data
        list1.add(10);
        list1.add(5);
        list1.add(55);
        list1.add(78);
        list1.add(34);
        //list1.add(null);
        list1.add(55);
        list1.add(23);
        //list1.add(null);
        list1.add(3);

        System.out.println("list1 is : "+list1);

        // remove data
        list1.remove(5);
        System.out.println("list1 after removing 5th index : "+list1);

        // size
        System.out.println("list1 size is : "+list1.size());

        // search
        System.out.println("list1 3rd index data is : "+list1.get(3));
        System.out.println("list1 5th index data is : "+list1.get(5));

        // sort
        Collections.sort(list1); // sorts in ascending order
        System.out.println("list1 in ascending order : "+list1);
        Collections.sort(list1, Collections.reverseOrder()); // sorts in descending order
        System.out.println("list1 in descending order : "+list1);

        // traversing the list
        System.out.println("traversing using foreach loop");
        for (Integer l1 : list1){
            System.out.println(l1);
        }

    }
}
