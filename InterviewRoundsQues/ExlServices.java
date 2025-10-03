import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExlServices {
    public static void main(String[] args) {
        String str = "rajendra";
//    find second non repeating character
        List<Character> chars =
                str.toLowerCase().chars()
                .mapToObj(
                        c -> (char) c
                )
                .collect(Collectors.toList());

        Map<Character, Long> frequency =
                chars.stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        )
                );

        List<Character> result =
                frequency.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry :: getKey)
                .collect(Collectors.toList());

        if(result.size() >= 2) {
            System.out.println(result.get(1));
        }else {
            System.out.println("No second repeating char found !");
        }

    }

}
