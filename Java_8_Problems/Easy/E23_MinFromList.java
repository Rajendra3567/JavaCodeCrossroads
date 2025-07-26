package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class E23_MinFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 3,1,234,65);
//        list.stream().sorted((a,b) -> a.compareTo(b)).findFirst().ifPresent(System.out::println);
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        min.ifPresent(value -> System.out.println("Minimum number value are : " + value));
    }
}
