import java.util.Arrays;

public class BruteForce {
    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        while(k-- > 0){
            int last = nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                nums[i]=nums[i-1];
            }

            nums[0]=last;

        }

        System.out.println(Arrays.toString(nums));

    }

}
