package Miscellanous;

import java.util.Arrays;
import java.util.Scanner;

public class M9_SumOfTwoLargestElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for(int i=0;i<n;i++) {
            numbers[i] = sc.nextInt();
        }

        int sorted[] = Arrays.stream(numbers)
                .boxed()
                .sorted((a,b) -> b -a)
                .mapToInt(Integer::intValue)
                .toArray();

        for(int i=0;i<n;i++) {
            System.out.print(sorted[i] + " ");
        }

//        Highest sum from first two elements
        int highestSum = sorted[0]+sorted[1];

        System.out.println("Highest Sum : " + highestSum);
    }
}
