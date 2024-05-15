package Easy;

import java.util.Scanner;

public class E5_Java_Output_Formatting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		System.out.print("Enter a integer: ");
		int n = sc.nextInt();
		
		if(s.length()<=10) {
			System.out.print(s);
			
		}
	}
}
