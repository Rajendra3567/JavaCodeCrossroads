import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        System.out.println("Test directory");
        List<Integer> list = Arrays.asList(1,9,2,2,4,1,4,5);
        HashSet<Integer> set = new HashSet<>();
        for(Integer num : list) {
            if(!set.add(num)) {
                set.remove(num);
            }
        }
    }
}
