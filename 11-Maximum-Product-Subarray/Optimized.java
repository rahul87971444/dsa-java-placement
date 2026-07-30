public class Optimized {

    public static void main(String[] args) {

        int nums[] = {2,3,-2,4};

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int answer = nums[0];

        for(int i=1;i<nums.length;i++){

            if(nums[i] < 0){

                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;

            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            answer = Math.max(answer, maxProduct);

        }

        System.out.println(answer);

    }

}
