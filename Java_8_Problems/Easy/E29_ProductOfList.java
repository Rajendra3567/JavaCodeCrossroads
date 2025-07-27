package Easy;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class E29_ProductOfList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,3);
        list.stream().reduce((n1,n2) -> n1*n2).ifPresent(System.out::println);
    }
}
