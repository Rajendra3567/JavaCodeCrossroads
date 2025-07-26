package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E24_AvgOfList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
       double sum = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Avg : " + sum);
    }
}
