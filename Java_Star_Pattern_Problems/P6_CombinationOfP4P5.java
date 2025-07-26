import java.util.Scanner;

public class P6_CombinationOfP4P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n/2; i++) {
            for(int j=i; j<n/2;j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        for(int l = 1; l<=n/2;l++) {
            for(int m = 1; m<=l; m++) {
                System.out.print(" ");
            }
            for(int p = (n/2)-1; p>=l; p--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
/*

----*
---**
--***
-****
*****
-****
--***
---**
----*


 */
