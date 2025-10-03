import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L5_DuplicateElementFromArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,4,2,7,8,9,4};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

    }
}
