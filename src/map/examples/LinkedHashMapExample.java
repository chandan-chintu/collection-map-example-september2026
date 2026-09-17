package map.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        Map<Integer,String> map1 = new LinkedHashMap<>();

        map1.put(107,"Guava");
        map1.put(105,"Mango");
        map1.put(-34,"Grapes");
        map1.put(null,"Orange");
        map1.put(110,"Apple");
        map1.put(102,"Apple");
        map1.put(103,"Watermelon");
        map1.put(102,"Pineapple"); // old value for key 102 will be removed and new value will be added

        System.out.println("map1 is : "+map1);

        map1.remove(null);
        System.out.println("map1 after remove null key : "+map1);

        System.out.println("traversing using foreach loop");
        for (Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey()+"---"+m1.getValue());
        }
    }
}
