package Miscellanous;

public class M7_TryWithoutCatchWithFinally {
    public static void main(String[] args) {
        try {
//            int[] arr = new int[Integer.MAX_VALUE];
            System.out.println("try block");
        } finally {
            System.out.println("Finally block always execute");
        }
    }
}
