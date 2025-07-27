package Miscellanous;

import java.util.Arrays;

public class M4_FindLongestWordInAString {
    public static void main(String[] args) {
        String sen = "123 45!@ 7890abcd!";
       String maxLengthString =
               Arrays.stream(sen.replaceAll("[^a-zA-Z0-9 ]", "")
                     .split("\\s+"))
                .reduce((s1,s2) -> s1.length() >+ s2.length() ? s1 : s2)
                .orElse("Empty");
        System.out.println(maxLengthString);

    }
}
