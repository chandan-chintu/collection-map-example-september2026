package collection.examples.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stck1 = new Stack<>();
        stck1.push("Guava");
        stck1.push("Mango");
        stck1.push("Grapes");
        stck1.push("Orange");
        stck1.push("Mango");
        stck1.push(null);

        System.out.println("stck1 is : "+stck1);

        stck1.pop();
        System.out.println("stck1 after 1st pop : "+stck1);
        stck1.pop();
        System.out.println("stck1 after 2nd pop : "+stck1);
// add some dummy lines
        System.out.println("stck1 traversal using foreach loop : ");
        for (String s1 : stck1){
            System.out.println(s1);
        }
    }
}
