package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E25_FilterStringByCharacter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grapes", "kiwi", "orange");
        List<String> result = words.stream().filter(word -> word.contains("k")).collect(Collectors.toList());
        System.out.println(result);
    }
}
