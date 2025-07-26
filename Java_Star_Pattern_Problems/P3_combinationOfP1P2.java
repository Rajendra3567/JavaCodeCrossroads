import java.util.Scanner;

public class P3_combinationOfP1P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for(int i=1;i<n/2;i++) {
            for(int j=1; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=1;i<=n/2;i++) {
            for(int j=n/2; j>=i;j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
