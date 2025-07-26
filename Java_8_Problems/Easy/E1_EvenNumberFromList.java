package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E1_EvenNumberFromList {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,0,10);
        List<Integer> evenList = numList.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenList);
    }
}
