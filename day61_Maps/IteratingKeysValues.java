package day61_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingKeysValues {

    public static void main(String[] args) {

        Map<String, LocalDate> students = new LinkedHashMap<>();
                students.put("Zara", LocalDate.of(1995, 9, 26));
                students.put("Iskender", LocalDate.of(2018, 9, 30));
                students.put("Erika", LocalDate.of(2019, 11, 18));
                students.put("Dan", LocalDate.of(1994, 5, 18));
                students.put("Amirhan", LocalDate.of(2017, 8, 20));
                students.put("Maha", LocalDate.of(1994, 4, 02));

        System.out.println(students);

         // applying loops to the keys
        for(String each : students.keySet()){
            System.out.println(each);
        }

        //applying loops to the values
        System.out.println("===============================================");
        for(LocalDate each : students.values()){
            System.out.println(each);
        }



    }

}
