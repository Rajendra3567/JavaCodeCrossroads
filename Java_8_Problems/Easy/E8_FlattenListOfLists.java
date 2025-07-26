package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E8_FlattenListOfLists {
    public static void main(String[] args) {
        List<List<Integer>>  numsList = Arrays.asList(
          Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9)
        );
        System.out.println("Before : " +numsList);
        List<Integer> flattenList = numsList.stream()
                        .flatMap(List::stream).collect(Collectors.toList());
        System.out.println("After : " +flattenList);
    }
}
