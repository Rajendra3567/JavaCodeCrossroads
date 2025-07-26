package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class E5_CheckWordStartingWithInStringList {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Apple", "Banana", "Couliflower", "Dragon", "Emily", "Fruits", "Graphes", null);
        Optional<List<String>> resultList =Optional.ofNullable(stringList.stream()
                                            .filter(name -> name != null && name.startsWith("G"))
                                            .collect(Collectors.toList()));
        resultList.ifPresent(System.out::println);
    }
}
