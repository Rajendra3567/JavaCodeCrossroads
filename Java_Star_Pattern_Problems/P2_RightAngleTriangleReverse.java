import java.util.Scanner;

public class P2_RightAngleTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num :");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++) { // n =5
            for(int j=n; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
