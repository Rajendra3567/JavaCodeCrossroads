package Easy;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class E3_MaxFromListOfInt {
    public static void main(String[] args) {
        List<Integer> numList = List.of(91,2,33,4,5,6,7,8,9,10,11,1222,13,1332);
//        approach 1 : using reversed, skip, findFirst function
        Optional<Integer> max = numList.stream()
                .sorted()
                .collect(Collectors.toList())
                .reversed().stream().skip(1).findFirst();
        System.out.println("SecondMax : "+max.get());
//        approach 2nd using method reference compareTo method
        Optional<Integer> maxValue = numList.stream()
                                            .max(Integer::compareTo);
        System.out.println("MaxValue : "+maxValue.get());
    }
}
