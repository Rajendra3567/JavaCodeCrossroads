// E6- WAP to find duplicate elements in a list using the stream api
package Easy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class E6_FindDuplicateFromList {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,34,3,1,3,43,312,5,1,3,2,54,6);
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateList = numList.stream()
                                             .filter(num -> !set.add(num))
                                             .collect(Collectors.toSet());
        System.out.println("Duplicate Numbers: " + duplicateList);

        List<String> namesList = List.of("Apple", "banana", "Apple", "Orange", "banana", "orange", "Apple", "banana", "Apple");
        Set<String> namesSet = new HashSet<String>();
        Set<String> duplicateStringList = namesList.stream()
                                                    .filter(name -> !namesSet.add(name)).collect(Collectors.toSet());
        System.out.println("Duplicate Names: " + duplicateStringList);
    }
}
