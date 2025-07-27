package Miscellanous;

import java.util.LinkedHashMap;
import java.util.Map;

public class M1_FirstNonRepeatingCharInString {
    public static void main(String[] args) {
        String name = "rajendra";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c : name.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) +1);
        }
        map.entrySet().stream()
                .filter(entry -> entry.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
