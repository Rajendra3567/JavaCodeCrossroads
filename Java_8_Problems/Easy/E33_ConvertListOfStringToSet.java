package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class E33_ConvertListOfStringToSet {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("rajendra", "apple", "mango", "graphes", "orange", "mango", "rajendra", "kiwi");
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}
