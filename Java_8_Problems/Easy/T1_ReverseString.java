package Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T1_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Original : "+ str);
        String[] words = str.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for(int i=words.length - 1; i>=0;i--) {
            reversed.append(words[i]);
            if(i !=0) {
                reversed.append(" ");
            }
        }
        System.out.println("Reversed : "+ reversed.toString());
    }
}
