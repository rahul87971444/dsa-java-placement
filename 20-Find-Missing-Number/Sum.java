public class Sum {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        long n = nums.length;
        long expected =
                n * (n + 1) / 2;
        long actual = 0;
        for (int num : nums) {
            actual += num;
        }
        long missing = expected - actual;
        System.out.println(missing);
    }
}
