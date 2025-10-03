public class P1_ReverseString {
    public static void main(String[] args) {
        String str = "Hundai";
        for(int i=str.toCharArray().length-1;i>=0;i--) {
            System.out.print(i+"");
        }
    }
}
