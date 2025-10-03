import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat","tea","tan","ate","nat","bat");
        Map<String, List<String>> groupedWordList
                = words.stream()
                            .collect(
                                    Collectors.groupingBy(
                                            word -> {
                                                char[] chars = word.toCharArray(); // e,a,t
                                                Arrays.sort(chars);

                                                return new String(chars);
                                            }
                                    )
                            );

        List<List<String>> result = new ArrayList<>(groupedWordList.values());
        System.out.println(result);
    }
}
