package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//         0 1 1 2 3 5 8 13 21 34
public class E36_ListOfFirst10FibonacciSeries {
    public static void main(String[] args) {
        int num = 10;
        List<Integer> list = Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(num).map(n -> n[0]).collect(Collectors.toList());
        System.out.println(list);
    /*    int n1 = 0;
        int n2 = 1;
        List<Integer> list = new ArrayList<>();
        list.add(n1);
        for (int i = 1; i <= num; i++) { // 1 2 3 4
            int n3 = n1 + n2; // 1 1 3 5
            n2 = n1; // 0 1 2
            n1 = n3; // 1 2 3
            list.add(n3);
        }
        System.out.println(list); */

    }
}
