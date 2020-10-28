package day62_Maps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.*;

public class ListOfMaps2 {

    public static void main(String[] args) {

        String[] friends = {"Maha", "Dan", "Amirhan", "Alinur"};
        LocalDate[] DOBFriends = {
                LocalDate.of(1995, 3, 17),
                LocalDate.of(1998, 6, 19),
                LocalDate.of(1992, 9, 28),
                LocalDate.of(1997, 4, 25)};

        String[] classMates = {"Mike", "Brian", "Alicia", "Bernie"};
        LocalDate[] DOBClassMates = {
                LocalDate.of(1995, 4, 14),
                LocalDate.of(1996, 6, 30),
                LocalDate.of(1997, 9, 12),
                LocalDate.of(1994, 2, 18)};




    String[] family = {"Zara", "Iskender", "Erika", "Ernie"};
    LocalDate[] DOBFamily = {
            LocalDate.of(1995, 3, 17),
            LocalDate.of(1996, 6, 19),
            LocalDate.of(1997, 9, 28),
            LocalDate.of(1993, 2, 21)
};

    List<Map<String, LocalDate>> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
                ) );


        for(int i = 0; i < friends.length; i++){
        list.get(0).put(friends[i], DOBFriends[i]);
    }

        for(int i = 0; i <classMates.length; i++){
        list.get(1).put(classMates[i], DOBClassMates[i]);
    }

        for(int i=0; i < family.length; i++){
        list.get(2).put(family[i], DOBFamily[i]);
    }

        System.out.println(list);




}

}








