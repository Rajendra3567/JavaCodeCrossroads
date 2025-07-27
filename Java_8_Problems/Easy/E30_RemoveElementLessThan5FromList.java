package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E30_RemoveElementLessThan5FromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,14);
        List<Integer> result =list.stream().filter(n -> n>5).collect(Collectors.toList());
        System.out.println(result);
    }
}
