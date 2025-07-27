package Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class E40_CountNumOfCharacterInAList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("orange", "mango", "grapes", "apple", "kiwi");
        int size = list.stream().mapToInt(String::length).sum();
        System.out.println(size);
    }
}
