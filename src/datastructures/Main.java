package datastructures;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "mahesh");
        map1.put(2, "Harish");
        map1.put(3, "James");
        map1.put(4, "Akhil");

       Map<Integer, String> sortedMap =
               map1.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(
                       Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


               //map1.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).collect(Collectors.groupingBy(entry -> entry.getKey(), Collectors.groupingBy(o -> o.getValue())));
    }
}