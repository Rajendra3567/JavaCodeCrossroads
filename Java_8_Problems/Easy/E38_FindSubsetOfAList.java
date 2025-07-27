package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E38_FindSubsetOfAList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for(Integer element : list) {
            List<List<Integer>> newSubsets = new ArrayList<>();
            for(List<Integer> subset : subsets) {
                List<Integer> newSubset = new ArrayList<>(subset);
                newSubset.add(element);
                newSubsets.add(newSubset);
            }
            subsets.addAll(newSubsets);
        }
        System.out.println(subsets);
    }
}
