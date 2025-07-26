import java.util.Scanner;

public class P1_RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num :");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++) { // n =5
            for(int j=1; j<=i; j++) {
                System.out.print("+");
            }
            System.out.println("");
        }
    }
}
