package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class E13_RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<String> fruitList = Arrays.asList("orange", "apple", "mango", "orange", "mango", "papaya");
        Set<String> set = new HashSet<>();
        System.out.println("OriginalList : " + fruitList);
        Set<String> duplicateList = fruitList.stream().filter(i -> set.add(i)).collect(Collectors.toSet());
        System.out.println("DistinctList : " + duplicateList);

        List<Integer> numList = Arrays.asList(1,2,3,4,4,3,2,1,33,22,1);
        List<Integer> distinctList = numList.stream().distinct().collect(Collectors.toList());
        System.out.println("Num List : " + distinctList);
    }
}
