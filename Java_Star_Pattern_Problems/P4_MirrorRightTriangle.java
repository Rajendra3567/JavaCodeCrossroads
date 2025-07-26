import java.util.Scanner;

public class P4_MirrorRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) { // 1
            for(int j = i; j<n;j++) {
                System.out.print(" "); // ----* ---*
            }
            for(int k= 1; k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}