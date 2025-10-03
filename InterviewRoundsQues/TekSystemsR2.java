import java.util.HashSet;

//Array = [1,2,5,4,9], target = 9
//Find if there exists a sum of two elements which is equal to the target.
//
public class TekSystemsR2 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,9};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();
        boolean exists = false;

        for(int num : arr) {
          int comp = target - num;
          if(set.contains(comp)) {
              exists = true;
              System.out.println(exists);
              break;
          }
          set.add(num);
        }

        if(!exists) {
            System.out.println(exists);
        }
    }
}
