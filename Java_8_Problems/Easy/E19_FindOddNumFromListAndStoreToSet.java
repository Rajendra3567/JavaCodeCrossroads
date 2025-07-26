package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class E19_FindOddNumFromListAndStoreToSet {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,11,12,13,14,15,16,23,24,25);
        Set<Integer> setList = numList.stream().filter(n -> n %2 !=0).collect(Collectors.toSet());
        System.out.println(setList);
    }
}
