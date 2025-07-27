package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class E35_RemoveDuplicateFromListOfString {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,3,4,7,5,4,11,12);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
        System.out.println(set);
       List<Integer> resultantList = list.stream().distinct().collect(Collectors.toList());
       System.out.println("resultantList : "+ resultantList);
    }
}
