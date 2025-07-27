package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class E28_SortListOfStringByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("rajendra", "keshav", "Harish", "Vishnu", "Pratap");
        List<String> list1 = list.stream()
                                 .sorted((s1,s2) -> Integer.compare(s2.length(),s1.length()))
                                         .collect(Collectors.toList());
        System.out.println(list1);
    }
}
