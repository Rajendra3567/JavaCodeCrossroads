package Miscellanous;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class M3_NullStreamTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,null);

    List<Integer> resultList =  Optional.ofNullable(list).orElse(Collections.emptyList())
                .stream().limit(3).collect(Collectors.toList());
        System.out.println(resultList);
    }
}
