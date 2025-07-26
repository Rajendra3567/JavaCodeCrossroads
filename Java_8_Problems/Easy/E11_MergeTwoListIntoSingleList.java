package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E11_MergeTwoListIntoSingleList {
    public static void main(String[] args) {
        List<Integer> numList1 = Arrays.asList(1,2,3,4,5);
        List<Integer> numList2 = Arrays.asList(6,7,8,9,10,1,5);

        Set<Integer> mergeList = Stream.concat(numList1.stream(), numList2.stream()).collect(Collectors.toSet());
        System.out.println("Merge Integer List : " + mergeList);

        List<String> fruits = Arrays.asList("Orange", "Apple", "graphes", "papaya", "Apple");
        List<String> vegetables = Arrays.asList("Onion", "Tomato", "Potato", "Tomato");
        Set<String> mergeStringList = Stream.concat(fruits.stream(), vegetables.stream()).collect(Collectors.toSet());
        System.out.println("Merge String List : "+ mergeStringList);


    }
}
