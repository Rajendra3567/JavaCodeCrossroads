package Easy;

import java.util.Arrays;
import java.util.List;

public class E15_SumOfAllElementsFromList {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = numList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum : " + sum);
    }
}