package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E7_RemoveNullFromList {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Apple", "Banana", "Graphes", "Pinepal", null);
      List<String> resultList =  namesList.stream().filter(name -> name !=null).collect(Collectors.toList());
        System.out.println(resultList);
    }
}
