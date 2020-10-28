package day61_Maps;

import java.util.*;

public class MapIntro {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>(); // Random

        Map<String, Integer> map2 = new TreeMap<>(); // Always sorted order

        Map<String, Integer> map3 = new LinkedHashMap<>(); // keeps the insertion order as is

        Map<String, Integer> map4 = new Hashtable<>(); // is synchronized == Thread safe

    }

}
