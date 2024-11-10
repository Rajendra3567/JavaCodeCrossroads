package Easy;

import java.util.Scanner;

public class LP_709_StrToLowerCase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		String result = toLowerCase(str);
		System.out.println(result);
	}
	    public static String toLowerCase(String s) {

	        // approach 1 
	        return s.toLowerCase();

	        //approach 2
	       /* char[] ch = s.toCharArray();
	        for(int i=0;i<ch.length;i++) {
	            if(ch[i] >=65 && ch[i] <= 90) { // uppercase
	                ch[i] = (char) (ch[i]+32);
	            }
	        }
	        return String.valueOf(ch); */


	    // approach 3
	  /*  String result = "";
	    for(int i=0;i<s.length();i++) {
	        if('A' <=s.charAt(i) && s.charAt(i) <= 'Z') {
	             result += (char)(s.charAt(i) + 32);
	        } else {
	            result +=s.charAt(i);
	        }
	    }
	    return result; */

	    // approach 4
	    
	  /*  StringBuilder sb = new StringBuilder();
	    for(char c : s.toCharArray()) {
	        if(c >= 65 && c <= 90) {
	            c = (char) (c + 32);
	        }
	        sb.append(c);
	    }
	    return sb.toString(); */
	}
	}
