package Easy;

import java.util.Arrays;
import java.util.List;

public class E18_SecondHighestFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,28,99);
        list.stream().sorted((a,b) -> b.compareTo(a)).skip(1).findFirst().ifPresent(System.out::println);
//        list.stream().sorted((a,b) -> b.compareTo(a)).skip(1).findFirst().ifPresent(System.out::println);
    }
}
