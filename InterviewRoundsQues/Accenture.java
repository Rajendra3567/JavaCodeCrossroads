import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Accenture {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a a", "b b", "c c", "d d");
        List<String> result =
                Stream.concat(list.stream()
                .skip(1),
                list.stream()
                        .limit(1))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
