package Easy;

import java.util.Arrays;
import java.util.List;

public class E31_SecondSmallestElementInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(null);
        list.stream().sorted((n1,n2) -> n1.compareTo(n2)).skip(1).findFirst();// .ifPresent(System.out::println);
    }
}
