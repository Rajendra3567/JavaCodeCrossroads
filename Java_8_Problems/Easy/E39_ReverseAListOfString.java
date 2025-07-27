package Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class E39_ReverseAListOfString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "mango", "graphes", "orange", "kiwi");
        Collections.reverse(list);
        System.out.println(list);
    }
}
