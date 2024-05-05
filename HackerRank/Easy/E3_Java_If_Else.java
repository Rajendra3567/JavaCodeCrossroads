package Easy;

import java.util.Scanner;

public class E3_Java_If_Else {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int n = sc.nextInt();
		
		if(n %2 == 0) {
			System.out.println("Not Wierd");
		}
		else {
			System.out.println("Wierd");
		}
	}
}
