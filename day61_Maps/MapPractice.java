package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Double> employees = new LinkedHashMap<>();
        employees.put("Zara", 150000.0);
        employees.put("Ernie", 125000.0);
        employees.put("Iskender", 130000.0);
        employees.put("Erika", 140000.0);
        employees.put("Amirhan", 120000.0);

        System.out.println(employees);
        System.out.println(employees.size()); // returns quantity of pairs of data

        System.out.println("Salary of Zara: $"+employees.get("Zara"));

        employees.remove("Zara");

        System.out.println(employees);
        System.out.println(employees.size());

        boolean r1 = employees.containsKey("Amirhan");
        System.out.println(r1);

        boolean r2 = employees.containsValue(150000.0);
        System.out.println(r2);

        boolean r3 = employees.containsValue(130000.0);
        System.out.println(r3);

        employees.clear();

        System.out.println(employees);

        System.out.println(employees.isEmpty());




    }

}
