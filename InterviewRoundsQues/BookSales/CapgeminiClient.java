package BookSales;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CapgeminiClient {
    public static void main(String[] args) {
//        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        List<String> words2 = Arrays.asList("apple", "banana", "bear", "cat", "apple", "dog");

        Map<Character, Long> result =
                words2.stream()
                     .collect(Collectors.groupingBy(word -> word.charAt(0),Collectors.counting()));
        System.out.println(result);
    }
}
