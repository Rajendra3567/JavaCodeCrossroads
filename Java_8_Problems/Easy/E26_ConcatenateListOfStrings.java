package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E26_ConcatenateListOfStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grapes", "kiwi", "orange");
        String result = words.stream().collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
