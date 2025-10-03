package BookSales;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Capgemini2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "1");
        map.put("B", "1");
        map.put("C", "1");
        map.put("D", "2");
        map.put("E", "2");

        Map<String, List<String>> result =
                map.entrySet()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Map.Entry::getValue,
                                Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                        )
                );
        System.out.println(result);
    }
}
