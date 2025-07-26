package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class E4_GroupStringListByLength {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Dum","Apple", "Orange", "Apple", "Banana", "Apple", "Orange","Papaya", "Grapes");
        Map<Integer, List<String>> groupedList = stringList.stream()
                .collect(
                        Collectors.groupingBy(String::length)
                );
        System.out.println("Grouped List : " + groupedList);
    }
}
