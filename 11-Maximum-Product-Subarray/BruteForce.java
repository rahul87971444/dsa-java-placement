public class BruteForce {
    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};
        int answer = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int product = 1;
            for(int j=i;j<nums.length;j++){
                product *= nums[j];
                answer = Math.max(answer,product);
            }
        }
        System.out.println(answer);

    }

}
