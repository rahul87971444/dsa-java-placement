import java.util.Arrays;

public class BruteForce {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4};
        int ans[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){

            int product=1;

            for(int j=0;j<nums.length;j++){

                if(i!=j)
                    product*=nums[j];

            }

            ans[i]=product;

        }

        System.out.println(Arrays.toString(ans));

    }

}
