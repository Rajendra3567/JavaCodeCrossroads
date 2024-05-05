package Easy;

import java.util.Scanner;

public class E4_StdIn_StdOut_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		System.out.println("Enter double/float value : ");
		double d = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + n);
	}
}
