import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example5 {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,0,1,1,1,1,0,0,1};
        int left = 0;
        for(int i = 0; i<arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[left];
            arr[left] = temp;
            left++;
            System.out.print(arr[i]);
        }

//        int countZero = 0;
//        for(int num : arr) {
//            if(num == 0) {
//                countZero++;
//            }
//        }
//        for(int i = 0; i<arr.length; i++) {
//           arr[i] = (i<countZero) ? 0:1;
//        }
//
//        for(int num : arr) {
//            System.out.print(num + " ");
//        }
    }

}
