package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E21_SkipFirst3ElementsFromList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of elements : ");
        int size = sc.nextInt();
        System.out.println("Enter " + size + "integers : ");
        for(int i=0;i<size;i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        sc.close();

       List<Integer> resultList = list.stream().skip(3).collect(Collectors.toList());
        System.out.println(resultList);
    }
}
