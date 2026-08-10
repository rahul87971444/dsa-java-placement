public class BruteForce {
    public static void main(String[] args) {
        int[] nums = {
            4,5,6,7,0,1,2
        };
        int target = 0;
        int answer = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
