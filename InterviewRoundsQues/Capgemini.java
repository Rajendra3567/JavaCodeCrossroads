import java.util.Arrays;
import java.util.List;

public class Capgemini {
    public static void main(String[] args) {
        //a,a,m,m,m,e,e,f,f,g,g
        //a2m3e2f2g2
        List<Character> input = Arrays.asList('a','a','m','m','m','e','e','f','f','g','g');
        StringBuilder output = new StringBuilder();

        int i =0;
        int size = input.size();
        while(i < size) {
            char ch = input.get(i);
            int count = 0;

//            while(i<size && input.get(i) == ch) {
//                count++;
//                i++;
//            }
        output.append(ch).append(count);
        }
        System.out.println(output);
    }
}
