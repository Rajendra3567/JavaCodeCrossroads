package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E37_CountPalindromInAList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("madam", "level", "racecar", "banana", "121");
        Long count = list.stream().filter(word -> new StringBuilder(word).reverse().toString().equals(word)).count();
        System.out.println(count);
    }
}
