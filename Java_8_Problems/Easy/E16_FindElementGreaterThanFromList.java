package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E16_FindElementGreaterThanFromList {
    public static void main(String[] args) {
//        approach 1
        List<Integer> numLists = Arrays.asList(1,2,3,4,5,6,7,8,9,10 ,11,14,111,23,4325,546,65);
        List<Integer> greaterList = numLists.stream().filter(n -> n>10).collect(Collectors.toList());
        System.out.println("Num greater than 10 : " + greaterList);
//        approach 2
        List<Integer> numLists1 = Arrays.asList(1213,2431,3542,4653,5653,6,7,8,9,10 ,11,14,111,23,4325,546,65);
        List<Integer> resultList = new ArrayList<>();
        for(int num : numLists1) {
            if(num >10) {
                resultList.add(num);
            }
        }
        System.out.println(resultList);
    }
}
