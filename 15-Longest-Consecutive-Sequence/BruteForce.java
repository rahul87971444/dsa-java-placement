public class BruteForce {
    static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int longest = 0;
        for (int num : nums) {
            int current = num;
            int length = 1;
            while (contains(nums, current + 1)) {
                current++;
                length++;
            }
            longest = Math.max(longest, length);
        }
        System.out.println("Longest = " + longest);
    }
}
