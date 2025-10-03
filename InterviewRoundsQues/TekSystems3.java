import java.util.Arrays;
import java.util.HashSet;
//Find the longest continuous sequence.
//Array = [1,4,2,6,3,8,5, 9, 10]
//Output: 6
//1,2,3,4,5,6
public class TekSystems3 {
    public static void main(String[] args) {
        int[] nums = {1,4,2,6,3,8,5, 9, 10};
        Arrays.sort(nums);
        int current = 1;
        int longest = 1;
        for(int i=1;i< nums.length;i++) {
            if(nums[i] == nums[i-1]+1) {
                current++;
              longest = Math.max(current,longest);
            } else if(nums[i] != nums[i-1]) {
                current = 1;
            }
        }

        System.out.println(longest);

    }
}
