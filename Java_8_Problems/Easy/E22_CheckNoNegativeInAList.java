package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E22_CheckNoNegativeInAList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter size of numbers : ");
        int size = sc.nextInt();
        for(int i=0; i<size; i++) {
            int n = sc.nextInt();
            list.add(n);
        }
        sc.close();

        Boolean result = list.stream().noneMatch(n -> n<0);
        System.out.println("No negative number ? : "+ result);

    }
}
