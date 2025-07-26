package Easy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class E10_NumFrequenceFromList {
    public static void main(String[] args) {
        List<String> numLists = Arrays.asList("Apple", "Orange", "Apple", "Banana", "Graphes","Pinepal", "Apple");
        Map<String,Long> freqMap = numLists.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        System.out.println(freqMap);
    }
}
