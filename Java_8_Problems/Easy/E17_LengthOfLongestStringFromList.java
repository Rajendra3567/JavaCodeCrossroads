package Easy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class E17_LengthOfLongestStringFromList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "orange", "mango", "papaya", "graphes");
        int maxLength = list.stream().mapToInt(String::length).max().orElse(0);
        System.out.println(maxLength);
    }
}
