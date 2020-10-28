package Office_Hours.Practice_10_07_2020;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListPractice {

    public static void main(String[] args) {

        List<String> list = new Vector<>();
        list.addAll(Arrays.asList("Zara", "Iskender", "Zara", "Zara", "Zara"));

        System.out.println(list);
        System.out.println(list.get(2));

        Stack<String> stack = new Stack<>();
        stack.addAll(list);

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.pop(); // Last in First out

        System.out.println(stack);

        stack.pop(); // Iskender
        stack.pop(); // Zara

        System.out.println(stack);
    }

}
