package Miscellanous;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class M6_ToggleCaseOfEachCharInString {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        for(int i=0;i<name.length();i++) {
            String currChar = String.valueOf(name.charAt(i)); // E e
            String str = ""; //E
            if (currChar.equals(String.valueOf(name.charAt(i)).toUpperCase())) {
               str += currChar.toLowerCase();
            } else {
                str += currChar.toUpperCase();
            }
            System.out.print(str);
        }
    }
}

