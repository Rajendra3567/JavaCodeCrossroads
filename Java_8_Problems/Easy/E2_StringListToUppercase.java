package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E2_StringListToUppercase {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Rajendra", "Yash", "Shubham", "Keshav");
        List<String> resultList = stringList.stream()
//                .map(str -> str.toLowerCase()) ( use bellow line for best practice
                .map(String :: toUpperCase)
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}
