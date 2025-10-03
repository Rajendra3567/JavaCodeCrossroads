import java.util.Scanner;

public class L1_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();

//        Approach 1
/*        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb); */

//        Approach 2
        for(int i = str.length() -1; i>=0; i--) {
            char ch[] = new char[str.length()];
            ch[i] = str.charAt(i);
            System.out.print(ch[i]);
        }




    }
}
