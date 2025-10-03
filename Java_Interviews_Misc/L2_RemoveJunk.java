import java.util.Scanner;

public class L2_RemoveJunk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

//      Regular expression [^a-zA-Z0-9]
        str = str.replaceAll("[a-zA-Z0-9 ]", "");
        System.out.println(str);
    }
}
