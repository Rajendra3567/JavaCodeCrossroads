package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class E9_PartitionEvenOddFromList {
    public static void main(String[] args) {
        List<Integer> numLists = Arrays.asList(1,24,77,3,4,5,6,7,8,9,10,11,12,13,14,15);
        Map<Boolean, List<Integer>> map = numLists.stream().collect(Collectors.partitioningBy(n -> n%2==0));
        System.out.println("Even : " + map.get(true));
        System.out.println("Odd : " + map.get(false));
    }
}
