package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E34_FindMidianValueFromListOfInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,52,693,7,8,9,10,32,43,43);
        List<Integer> res = list.stream().sorted((n1,n2) -> n1.compareTo(n2)).collect(Collectors.toList());
        int size = list.size();
        if(list.size() %2 == 0) {
            System.out.println("Even : " + list.get((size/2)-1));
        } else {
            System.out.println("Odd : " + list.get(size/2));
        }
        System.out.println(res);
    }
}
