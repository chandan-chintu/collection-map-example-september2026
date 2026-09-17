package collection.examples.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();

//        Set<?> set2 = new HashSet<>(); allow
//        Set<Object> set3 = new HashSet<>(); allow

        set1.add(34);
        set1.add(56);
        set1.add(23);
        set1.add(-56);
        set1.add(null);
        set1.add(-12);
        set1.add(77);
        set1.add(56);
        set1.add(89);

        System.out.println("set1 is : "+set1);

        set1.remove(56);
        set1.remove(23);

        System.out.println("set1 after 2 removal is : "+set1);

        System.out.println("set1 traversal using foreach loop");
        for (Integer s1 : set1){
            System.out.println(s1);
        }
    }
}
