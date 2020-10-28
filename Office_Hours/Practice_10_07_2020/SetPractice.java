package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

       //String str = null;
       // System.out.println(str.toUpperCase());

        String[] names = {"Zara", "Iskender", "Erika", "Erika", "Erika", "Erika", "Erika"};

        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(names)); // random order
        System.out.println("Hash Set: "+hashSet);
        //System.out.println(hashSet.get(2)); // does have index number

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(names)); // Keeps the insertion as is
        System.out.println("Linked Hash Set: "+linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(names)); // Always sorts objects in ascending order
        System.out.println("Tree Set: "+treeSet);
    }

}
