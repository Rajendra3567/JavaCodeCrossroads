package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E20_CheckListPositiveOrNot {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(-1,2,3,4,1,11,6, 65,432);
        Boolean result = numList.stream().allMatch(n -> n>=0);
        System.out.println("All Positive ? :  " + result);
    }
}
