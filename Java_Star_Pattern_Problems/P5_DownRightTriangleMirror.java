import java.util.Scanner;

public class P5_DownRightTriangleMirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k = n; k >=i; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
