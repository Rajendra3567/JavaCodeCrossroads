import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample {

    private static boolean isPrime(int num) {
        if(num <= 1) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(num)).allMatch(i -> num % i != 0);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        List<Integer> newList = IntStream.rangeClosed(1,15)
                .filter(Sample::isPrime)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(newList);

    }
}
