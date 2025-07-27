package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E32_PalindromStringInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mam", "121","oyo", "hari");
        List<String> palindromString = list.stream().filter(word -> new StringBuilder(word).reverse().toString().equals(word)).collect(Collectors.toList());
        System.out.println(palindromString);
    }
}
