import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        Arrays.sort(nums);
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                missing = i;
                break;
            }
        }
        System.out.println(missing);
    }
}
