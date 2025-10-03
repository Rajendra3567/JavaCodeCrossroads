import java.util.Scanner;

public class L3_ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt(); // 125
//        int reverse = 0;
//        while(n != 0) {
//            reverse = reverse*10 + n %10;
//            n = n/10;
//        }
//        System.out.println(reverse);

//      approach 2
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);

    }
}
