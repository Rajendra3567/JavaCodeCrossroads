//import java.util.HashSet;
//import java.util.Set;
//
//public class Wipro1 {
//    public static void main(String[] args) {
//        String str = "apple";
//        longestSubstring(str);
//
////        System.out.println(maxLenght);
//    }
//
//    private static String longestSubstring(String str) {
//
//        Set<Character> set = new HashSet<>();
//        int left =0;
//        int maxLenght = 0;
//        int startIndex = 0
//        for(int right = 0; right<str.length();right++) {
//            char ch = str.charAt(right);
//            // ch 'r', 'j', 'a', 'p'
//            while(set.contains(ch)) {
//                set.remove(str.charAt(left));
//                left++;
//            }
//            set.add(ch); //  maxLe 4
//            if(right-left+1 > maxLenght) {
//                maxLenght = right -left;
//                startIndex = left;
//            }
////           maxLenght = Math.max(maxLenght,right-left+1)
//        }
//        return str.substring()
//    }
//}
