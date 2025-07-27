package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E27_PrimeNumFromList {

    public static boolean IsPrimeNumber(int n) {
        if(n <=1) return false;
        if(n == 2) return true;
        if(n %2 == 0) return false;

        for(int i = 3; i<= Math.sqrt(n); i +=2) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,2,32,4,5,6,7,8,9,10);
        List<Integer> prime =list.stream().filter(E27_PrimeNumFromList::IsPrimeNumber).collect(Collectors.toList());

        System.out.println("Prime : " + prime);
    }
}
