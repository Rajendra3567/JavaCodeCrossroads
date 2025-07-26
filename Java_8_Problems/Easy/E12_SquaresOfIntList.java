package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E12_SquaresOfIntList {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> squaresList = numList.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(squaresList);
    }
}
