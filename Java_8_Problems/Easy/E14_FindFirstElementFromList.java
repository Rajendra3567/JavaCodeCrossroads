package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class E14_FindFirstElementFromList {
    public static void main(String[] args) {
        List<Integer> numList = List.of(743,32,4,1);
        numList.stream().findFirst().ifPresent(System.out::println);
    }
}
